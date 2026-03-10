package com.mainapp.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dto.EmpDto;
import com.mainapp.dto.external.AccDto;
import com.mainapp.dto.external.PlotDto;
import com.mainapp.dto.hybrid.EmpFullDto;
import com.mainapp.entity.EmpEntity;
import com.mainapp.exception.ResourceNotFoundException;
import com.mainapp.external.client.AccClient;
import com.mainapp.external.client.PlotClient;
import com.mainapp.payload.ApiResponse;
import com.mainapp.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private PlotClient plotClient;
	
	@Autowired
	private AccClient accClient;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private EmpRepository empRepository;

	@Override
	public ApiResponse<EmpEntity> saveEmp(EmpDto empDto) {
		EmpEntity map = modelMapper.map(empDto, EmpEntity.class);
		map.setId(UUID.randomUUID().toString());
		map.setDatetime(LocalDateTime.now().toString());
		EmpEntity save = empRepository.save(map);
		return new ApiResponse<>("SUCCESS","Emp Data Created",save);
	}

	@Override
	public ApiResponse<List<EmpEntity>> getAllEmp() {
		List<EmpEntity> allEmp = empRepository.findAll();
		if(allEmp.isEmpty()) {
			return new ApiResponse<>("SUCCESS","Emp Data Not found",allEmp);
		}else {
			return new ApiResponse<>("SUCCESS","Emp Data found",allEmp);
		}
	}

	@Override
	public ApiResponse<EmpEntity> getSingleEmp(String id) {
		Supplier<ResourceNotFoundException> supplier = new Supplier<ResourceNotFoundException>() {
			@Override
			public ResourceNotFoundException get() {
				return new ResourceNotFoundException("Resource Not Found with id: "+id);
			}
		};
		EmpEntity singleEmp = empRepository.findById(id).orElseThrow(supplier);
		return new ApiResponse<>("SUCCESS","Single Emp Data Found",singleEmp);
	}

	@Override
	public ApiResponse<EmpEntity> getFullEmp(@Valid EmpFullDto empFullDto) {
		//emp => save
		EmpDto empDto = empFullDto.getEmpDto();
		ApiResponse<EmpEntity> savedEmpResponse = saveEmp(empDto);
		EmpEntity savedEmp = savedEmpResponse.getData();
		
		//acc => acc microservice
		AccDto accDto = empFullDto.getAccDto();
		accDto.setEmployeeId(savedEmp.getId());
		accClient.saveAcc(accDto);
		
		//plot => plot microservice
		PlotDto plotDto = empFullDto.getPlotDto();
		plotDto.setEmployeeId(savedEmp.getId());
		plotClient.savePlot(plotDto);
		
		return new ApiResponse<>("SUCCESS","Emp full data saved successfully",savedEmp);
	}

	@Override
	@Transactional
	public ApiResponse<Object> deleteFullEmp(String id) {
		//deleteEmp
		empRepository.deleteById(id);
		//deleteAcc => feign
		accClient.deleteAcc(id);
		//deletePlot => feign
		plotClient.deletePlot(id);
		
		return new ApiResponse<>("SUCCESS","Emp data deleted",Collections.emptyMap());
	}
	
	
}
