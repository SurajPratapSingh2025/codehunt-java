package com.mainapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.dto.EmpDto;
import com.mainapp.dto.hybrid.EmpFullDto;
import com.mainapp.entity.EmpEntity;
import com.mainapp.payload.ApiResponse;
import com.mainapp.service.EmpServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpServiceImpl empServiceImpl;
	
	
	//save all emp
	@PostMapping
	public ResponseEntity<ApiResponse<EmpEntity>> save(@Valid @RequestBody EmpDto empDto){		//MethodArgumentNotValidException
		ApiResponse<EmpEntity> saveEmp = empServiceImpl.saveEmp(empDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveEmp);
	}
	//get all emp
	@GetMapping
	public ResponseEntity<ApiResponse<List<EmpEntity>>> findAll() {
		ApiResponse<List<EmpEntity>> allEmp = empServiceImpl.getAllEmp();
		return ResponseEntity.ok(allEmp);
	}
	
	//get single emp
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<EmpEntity>> findById(@PathVariable String id){
		ApiResponse<EmpEntity> singleEmp = empServiceImpl.getSingleEmp(id);
		return ResponseEntity.ok(singleEmp);
	}
	
	
	//empFullData
	@GetMapping("/full")
	public ResponseEntity<ApiResponse<EmpEntity>> saveFullEmp(@Valid @RequestBody EmpFullDto empFullDto){
		ApiResponse<EmpEntity> fullEmp = empServiceImpl.getFullEmp(empFullDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(fullEmp);
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse<Object>> deleteFullEmp(@PathVariable String id){
		ApiResponse<Object> fullEmp = empServiceImpl.deleteFullEmp(id);
		return ResponseEntity.ok(fullEmp);
	}
	
	
	
}
