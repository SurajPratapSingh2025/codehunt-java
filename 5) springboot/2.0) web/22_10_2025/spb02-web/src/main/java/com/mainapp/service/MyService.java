package com.mainapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dto.StudentDto;
import com.mainapp.entity.StudentEntity;
import com.mainapp.repository.StudentRepository;

@Service
public class MyService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public StudentEntity save(StudentDto studentDto) {
		StudentEntity save = studentRepository.save(new StudentEntity(studentDto.getRollno(),studentDto.getFullname(),studentDto.getCourse(),studentDto.getFee(),studentDto.getCollege(),studentDto.getAddress()));
		
		return save;
	}
	
	public List<StudentEntity> findAll() {
		return studentRepository.findAll();
	}
	
	public Optional<StudentEntity> findById(int rollno) {
		return studentRepository.findById(rollno);
	}
	
	
	public void deleteAll() {
		studentRepository.deleteAll();
	}
	
	public void deleteById(int rollno) {
		studentRepository.deleteById(rollno);
	}
}
