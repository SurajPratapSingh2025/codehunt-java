package com.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.EmployeeDTO;
import com.app.entity.EmployeeEntity;
import com.app.service.MyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/")
public class MyController {
	@Autowired
	private MyService myService;

	
	
	@PostMapping("employees")
	public ResponseEntity<?> insert(@Valid @RequestBody EmployeeDTO employeeDTO, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			List<String> list=new ArrayList<>();
			for(ObjectError objectError : bindingResult.getAllErrors()) {
				list.add(objectError.getDefaultMessage());
			}
			return new ResponseEntity<>(list,HttpStatus.BAD_REQUEST);
		}else {
			EmployeeEntity savedEmployee = myService.insert(employeeDTO);
			Map<Object, Object> map=new HashMap<>();
			map.put("message", "Employee saved successfully");
			map.put("data", savedEmployee);
			return new ResponseEntity(map,HttpStatus.CREATED);
		}
	}
	
	
	
	@GetMapping("employees")
	public ResponseEntity<List<EmployeeEntity>> readAll() {
		List<EmployeeEntity> list=myService.readAll();
		return ResponseEntity.ok(list);
	}
	
	
	@GetMapping("employees/{id}")
	public ResponseEntity<?> readSingle(@PathVariable int id) {
		Optional<EmployeeEntity> data = myService.readSingle(id);
		if(data.isPresent()) {
			return ResponseEntity.ok(data.get());
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID DOESN't EXISTS");
		}
	}
	
	
	//Full Object Update
	
	@PutMapping("employee/{id}")
	public ResponseEntity<?> updateAll(@PathVariable int id,@Valid @RequestBody EmployeeDTO employeeDTO, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			List<String> list=new ArrayList<>();
			for(ObjectError objectError : bindingResult.getAllErrors()) {
				list.add(objectError.getDefaultMessage());
			}
			return new ResponseEntity<>(list,HttpStatus.BAD_REQUEST);
		}else {
			
			Optional<EmployeeEntity> data = myService.readSingle(id);
			if(data.isPresent()) {
				EmployeeEntity employeeEntity=data.get();
				//Update Service
				EmployeeEntity updatedEmployee = myService.updateAll(employeeDTO, employeeEntity);
				Map<Object,Object> map=new HashMap<>();
				map.put("message", "Employee updated successfully");
				map.put("data", updatedEmployee);
				
				return ResponseEntity.ok(map);
			}else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID DOES NOT EXISI");
			}
			
		}
		
	}
	
	
	
	@PatchMapping("employee/{id}")
	public ResponseEntity<?> updatePartial(@PathVariable int id, @RequestBody Map<String,Object> map){
		//1.VALID
		List<String> errorList=myService.validation(map);
		if(errorList.isEmpty()) {
			//2.ID EXIST
			Optional<EmployeeEntity> data=myService.readSingle(id);
			if(data.isPresent()) {
				
				EmployeeEntity employeeEntity=data.get();
				//3.UPDATE
				EmployeeEntity partialUpdateEmployee = myService.partialUpdate(employeeEntity, map);
				Map<Object, Object> map1=new HashMap<>();
				map1.put("message", "Employee partial updated successfully");
				map1.put("data", partialUpdateEmployee);
				
				return ResponseEntity.ok(map1);
			}else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID DOES NOT EXIST");
			}
		}else {
			return new ResponseEntity<>(errorList,HttpStatus.BAD_REQUEST);
		}
		
		
		
		
	}
	
	
	
	@DeleteMapping("employees/{id}")
	public ResponseEntity<?> deleteSingle(@PathVariable int id){
		
		Optional<EmployeeEntity> data = myService.readSingle(id);
		if(data.isPresent()) {
			//delete
			myService.delete(id);
			return ResponseEntity.ok("EMPLOYEE DELETED SUCCESSFULLY");
			
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID DOESN't EXIST");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
