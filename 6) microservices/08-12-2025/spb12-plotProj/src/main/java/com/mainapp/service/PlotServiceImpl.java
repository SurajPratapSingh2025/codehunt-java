package com.mainapp.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.mainapp.dto.PlotDto;
import com.mainapp.entity.PlotEntity;
import com.mainapp.exception.ResourceNotFoundException;
import com.mainapp.exception.external.EmpServiceException;
import com.mainapp.external.client.EmpClient;
import com.mainapp.payload.ApiResponse;
import com.mainapp.repository.PlotRepository;

import feign.FeignException;

@Service
public class PlotServiceImpl implements PlotService{
	
	@Autowired
	private EmpClient empClient;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private PlotRepository plotRepository;

	@Override
	public ApiResponse<PlotEntity> savePlot(PlotDto plotDto) {
		
		//check if emp id is present or not
		try {
			empClient.getSingleEmp(plotDto.getEmployeeId());
		} catch (FeignException e) {
			HttpStatus httpStatus = HttpStatus.resolve(e.status());
			if(httpStatus==null) {
				httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
			}
			String message;
			if(httpStatus==HttpStatus.BAD_REQUEST) {
				message="Emp not found with id: "+plotDto.getEmployeeId();
			}else {
				message="Error while communicating with Emp Service";
			}
			
			throw new EmpServiceException(message,httpStatus,e);
			
		}
		
		
		
		PlotEntity map = modelMapper.map(plotDto, PlotEntity.class);
		map.setId(UUID.randomUUID().toString());
		map.setDatetime(LocalDateTime.now().toString());
		PlotEntity save = plotRepository.save(map);
		return new ApiResponse<>("SUCCESS","Plot Data Created",save);
	}

	@Override
	public ApiResponse<List<PlotEntity>> getAllPlot() {
		List<PlotEntity> allPlot = plotRepository.findAll();
		if(allPlot.isEmpty()) {
			return new ApiResponse<>("SUCCESS","Plot Data Not found",allPlot);
		}else {
			return new ApiResponse<>("SUCCESS","Plot Data found",allPlot);
		}
	}

	@Override
	public ApiResponse<PlotEntity> getSinglePlot(String id) {
		Supplier<ResourceNotFoundException> supplier = new Supplier<ResourceNotFoundException>() {
			@Override
			public ResourceNotFoundException get() {
				return new ResourceNotFoundException("Resource Not Found with id: "+id);
			}
		};
		PlotEntity singlePlot = plotRepository.findById(id).orElseThrow(supplier);
		return new ApiResponse<>("SUCCESS","Single Plot Data Found",singlePlot);
	}
	
	@Override
	@Transactional
	public ApiResponse<Object> deletePlot(String id) {
		plotRepository.deleteByEmployeeId(id);
		return new ApiResponse<Object>("SUCCESS","Plot Data Deleted",Collections.emptyMap());
	}
	
	
}
