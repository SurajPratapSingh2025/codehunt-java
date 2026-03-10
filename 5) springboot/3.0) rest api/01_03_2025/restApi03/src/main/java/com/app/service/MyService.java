package com.app.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.app.dto.EmployeeDTO;
import com.app.entity.EmployeeEntity;

public interface MyService {
	
	EmployeeEntity insert(EmployeeDTO employeeDTO);
	
	List<EmployeeEntity> readAll();
	
	Optional<EmployeeEntity> readSingle(int id);
	
	EmployeeEntity updateAll(EmployeeDTO employeeDTO,EmployeeEntity employeeEntity);

	List<String> validation(Map<String, Object> map);

	EmployeeEntity partialUpdate(EmployeeEntity employeeEntity, Map<String, Object> map);

	void delete(int id);
	
	
	
	
	
	
	
	
	
	
	
}
