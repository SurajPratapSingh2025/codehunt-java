package com.app.service;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.EmployeeDTO;
import com.app.entity.EmployeeEntity;
import com.app.repository.EmployeeRespository;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

@Service
public class MyServiceImpl implements MyService{
	@Autowired
	private EmployeeRespository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	private Validator validator;
	
	public MyServiceImpl() {
		ValidatorFactory vf=Validation.buildDefaultValidatorFactory();
		Validator validator=vf.getValidator();
		this.validator=validator;
	}
	

	@Override
	public EmployeeEntity insert(EmployeeDTO employeeDTO) {
		EmployeeEntity entity = modelMapper.map(employeeDTO, EmployeeEntity.class);
		entity.setDate(LocalDate.now());
		return employeeRepository.save(entity);
	}

	@Override
	public List<EmployeeEntity> readAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Optional<EmployeeEntity> readSingle(int id) {
		return employeeRepository.findById(id);
	}

	@Override
	public EmployeeEntity updateAll(EmployeeDTO employeeDTO, EmployeeEntity employeeEntity) {
		
		modelMapper.map(employeeDTO, employeeEntity);
		employeeEntity.setDate(LocalDate.now());
		return employeeRepository.save(employeeEntity);
	}
	
	
	@Override
	public List<String> validation(Map<String,Object> map){
		
		List<String> errorList=new ArrayList<>();
		
		for(Entry<String,Object> entry:map.entrySet()) {
			String fieldName=entry.getKey();
			Object fieldValue = entry.getValue();
			
			try {
				Field field = EmployeeDTO.class.getDeclaredField(fieldName);
				field.setAccessible(true);
				
				EmployeeDTO employeeDTO=new EmployeeDTO();
				field.set(employeeDTO, fieldValue);
				
//				ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
//				Validator validator = vf.getValidator();
				
				Set<ConstraintViolation<EmployeeDTO>> voilations=validator.validate(employeeDTO);
				for(ConstraintViolation<EmployeeDTO> voilation : voilations) {
					errorList.add(voilation.getMessage());
				}
				
			}
			
//			catch (NoSuchFieldException e) {
//				errorList.add("KEY IS NOT CORRECT: "+fieldName);
//			}catch(IllegalAccessException e) {
//				e.printStackTrace();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
			catch(Exception e) {
				errorList.add("KEY IS NOT CORRECT: "+fieldName);
			}
			
		}
		return errorList;
		
	}
	
	
	
	
	//not scalable
	
//	@Override
//	public List<String> validation(Map<String,Object> map) {
//		
//		List<String> errorList=new ArrayList<>();
//		Set<String> fieldNames=new HashSet<>(Arrays.asList("name","address","salary"));
//		
//		for(Entry<String,Object> entry:map.entrySet()) {
//			String key=entry.getKey();
//			Object value = entry.getValue();
//			
//			
//			if(!fieldNames.contains(key)) {
//				errorList.add("KEY IS NOT CORRECT: "+key);
//			}
//			
//			if(key.equals("name")) {
//				String name=(String) value;
//				if(name.length()<2 || name.length()>3) {
//					errorList.add("NAME SIZE VALIDATION ERROR");
//				}
//			}
//			if(key.equals("address")) {
//				String address=(String) value;
//				if(address.length()<5 || address.length()>100) {
//					errorList.add("ADDRESS SIZE VALIDATION ERROR");
//				}
//			}
//			if(key.equals("salary")) {
//				Integer salary=(Integer) value;
//				if(salary<1000 || salary>10000) {
//					errorList.add("INVALID SALARY");
//				}
//			}
//		}
//		return errorList;
//		
//	}
	
	
	@Override
	public EmployeeEntity partialUpdate(EmployeeEntity employeeEntity,Map<String,Object> map) {
		
		for(Entry<String,Object> entry:map.entrySet()) {
			String fieldName=entry.getKey();
			Object fieldValue = entry.getValue();
			
			
			try {
				Field field = EmployeeEntity.class.getDeclaredField(fieldName);
				field.setAccessible(true);
				field.set(employeeEntity, fieldValue);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
//			if(fieldName.equals("name")) {
//				employeeEntity.setName((String) fieldValue);
//			}
//			if(fieldName.equals("salary")) {
//				employeeEntity.setSalary((Integer) fieldValue);
//			}
//			if(fieldName.equals("address")) {
//				employeeEntity.setAddress((String) fieldValue);
//			}
		
		}
		employeeEntity.setDate(LocalDate.now());
		return employeeRepository.save(employeeEntity);
	}
	
	
	@Override
	public void delete(int id) {
		employeeRepository.deleteById(id);
	}
	
	
	
	
}
