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

import com.mainapp.dto.AccDto;
import com.mainapp.entity.AccEntity;
import com.mainapp.payload.ApiResponse;
import com.mainapp.service.AccServiceImpl;

@RestController
@RequestMapping("/acc")
public class AccController {
	
	@Autowired
	private AccServiceImpl accServiceImpl;
	
	
	//save all acc
	@PostMapping
	public ResponseEntity<ApiResponse<AccEntity>> saveAcc(@Valid @RequestBody AccDto accDto){		//MethodArgumentNotValidException
		ApiResponse<AccEntity> saveAcc = accServiceImpl.saveAcc(accDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveAcc);
	}
	//get all acc
	@GetMapping
	public ResponseEntity<ApiResponse<List<AccEntity>>> findAll() {
		ApiResponse<List<AccEntity>> allAcc = accServiceImpl.getAllAcc();
		return ResponseEntity.ok(allAcc);
	}
	
	//get single acc
	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse<AccEntity>> findById(@PathVariable String id){
		ApiResponse<AccEntity> singleAcc = accServiceImpl.getSingleAcc(id);
		return ResponseEntity.ok(singleAcc);
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ApiResponse<Object>> deleteAcc(@PathVariable String id){
		
		ApiResponse<Object> accDeleteResponse = accServiceImpl.deleteAcc(id);
		return ResponseEntity.ok(accDeleteResponse);
	}
	
	
	
	
	
}
