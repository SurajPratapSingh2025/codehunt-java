package com.mainapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mainapp.dto.StudentDto;
import com.mainapp.entity.StudentEntity;
import com.mainapp.service.MyService;

@RestController
public class MyController {
		
	@Autowired
	private MyService myService;
	
	
	
	@GetMapping(path= {"insert"})
	public ResponseEntity<StudentEntity> insert(@RequestBody StudentDto studentDto){
		StudentEntity save = myService.save(studentDto);
		if(save!=null) {
//			return ResponseEntity.ok().body(save);
			return new ResponseEntity<StudentEntity>(save,HttpStatus.CREATED);
		}else {
			return ResponseEntity.unprocessableEntity().build();
		}
		
	}
	
	@PostMapping("/read")
	public ResponseEntity<List<StudentEntity>> read() {
		List<StudentEntity> findall = myService.findall();
		if(findall.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}else {
			return ResponseEntity.status(HttpStatus.OK).body(findall);
		}
	}
	
	@PostMapping("/read/{id}")
	public ResponseEntity<?> read(@PathVariable int id) {
		Optional<StudentEntity> byId = myService.findById(id);
		if(byId.isPresent()) {
			StudentEntity studentEntity=byId.get();
			return ResponseEntity.status(HttpStatus.OK).body(studentEntity);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@PathVariable int id,@RequestBody StudentDto studentDto) {
		
		//custom query
//		boolean update = myService.update(id, studentDto);
//		if(update) {
		StudentEntity update = myService.update(id, studentDto);
		if(update!=null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<?> update1(@PathVariable int id, @RequestBody StudentDto studentDto){
//		boolean updateFee = myService.updateFee(id, studentDto.getFee());
//		if(updateFee) {
		StudentEntity updateFee = myService.updateFee(id, studentDto.getFee());
		if(updateFee!=null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
//	@PatchMapping("/update/{id}")
//	public ResponseEntity<?> update2(@PathVariable int id,@RequestParam int rollno) {
//		StudentEntity updateRollno = myService.updateRollno(id, rollno);
//		if(updateRollno!=null) {
//			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
//		}else {
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable int id){
		myService.deleteById(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
	
}
