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

import com.mainapp.dto.AccDto;
import com.mainapp.entity.AccEntity;
import com.mainapp.exception.DuplicateResourceException;
import com.mainapp.exception.ResourceNotFoundException;
import com.mainapp.exception.external.EmpServiceException;
import com.mainapp.external.client.EmpClient;
import com.mainapp.payload.ApiResponse;
import com.mainapp.repository.AccRepository;

import feign.FeignException;

@Service
public class AccServiceImpl implements AccService{
	
	@Autowired
	private EmpClient empClient;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private AccRepository accRepository;

	@Override
	public ApiResponse<AccEntity> saveAcc(AccDto accDto) {
		
		//check if accno is already exist
		if(accRepository.findByAccno(accDto.getAccno()).isPresent()) {
			throw new DuplicateResourceException("Account Number already exist: "+accDto.getAccno());
		}
		
		//check if employee id is present or not
		try {
			empClient.getSingleEmp(accDto.getEmployeeId());
		} catch (FeignException e) {
			HttpStatus httpStatus = HttpStatus.resolve(e.status());
			if(httpStatus==null) {
				httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
			}
			String message;
			if(httpStatus==HttpStatus.BAD_REQUEST) {
				message="Emp not found with id: "+accDto.getEmployeeId();
			}else {
				message="Error while communicating with Emp Service";
			}
			
			throw new EmpServiceException(message,httpStatus,e);
			
			
		}
		
		
		
//		
//		//stop default exception handling behaviour
//		new DefaultResponseErrorHandler();
//		restTemplate.setErrorHandler(new DefaultResponseErrorHandler() {
//			@Override
//			public boolean hasError(ClientHttpResponse response) throws IOException{
//				return false;
//			}
//		});
//		
//		
//		//check if empid is not present
//		ResponseEntity<ApiResponse<EmpResponse>> response = restTemplate.exchange(
//				"http://localhost:8081/emp/"+accDto.getEmployeeId(),
//				HttpMethod.GET,
//				null, 
//				new ParameterizedTypeReference<ApiResponse<EmpResponse>>() {}
//				);
//		ApiResponse<EmpResponse> empApiResponse = response.getBody();
//		if(empApiResponse==null || !"SUCCESS".equalsIgnoreCase(empApiResponse.getStatus()) || empApiResponse.getData()==null) {
//			throw new ResourceNotFoundException("Emp not found with id:"+accDto.getEmployeeId());
//		}
//		
		
		
		
		AccEntity map = modelMapper.map(accDto, AccEntity.class);
		map.setId(UUID.randomUUID().toString());
		map.setDatetime(LocalDateTime.now().toString());
		AccEntity save = accRepository.save(map);
		return new ApiResponse<>("SUCCESS","Acc Data Created",save);
	}

	@Override
	public ApiResponse<List<AccEntity>> getAllAcc() {
		List<AccEntity> allAcc = accRepository.findAll();
		if(allAcc.isEmpty()) {
			return new ApiResponse<>("SUCCESS","Acc Data Not found",allAcc);
		}else {
			return new ApiResponse<>("SUCCESS","Acc Data found",allAcc);
		}
	}

	@Override
	public ApiResponse<AccEntity> getSingleAcc(String id) {
		Supplier<ResourceNotFoundException> supplier = new Supplier<ResourceNotFoundException>() {
			@Override
			public ResourceNotFoundException get() {
				return new ResourceNotFoundException("Resource Not Found with id: "+id);
			}
		};
		AccEntity singleAcc = accRepository.findById(id).orElseThrow(supplier);
		return new ApiResponse<>("SUCCESS","Single Acc Data Found",singleAcc);
	}

	@Override
	@Transactional
	public ApiResponse<Object> deleteAcc(String id) {
		accRepository.deleteByEmployeeId(id);
		return new ApiResponse<Object>("SUCCESS","Account Data Deleted",Collections.emptyMap());
	}
	
	
}
