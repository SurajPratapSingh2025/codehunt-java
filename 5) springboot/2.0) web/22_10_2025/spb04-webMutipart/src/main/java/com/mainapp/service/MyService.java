package com.mainapp.service;

import java.time.LocalDateTime;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dto.StudentDto;
import com.mainapp.entity.StudentEntity;
import com.mainapp.repository.StudentRepository;

@Service
public class MyService {
			
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private StudentRepository studentRepository;

	public StudentEntity save(StudentDto studentDto, String filename) {
		StudentEntity map = modelMapper.map(studentDto, StudentEntity.class);
		map.setId(0);
		map.setDatatime(LocalDateTime.now().toString());
		map.setFilename(filename);
		StudentEntity save = studentRepository.save(map);
		return save;
	}

	public List<StudentEntity> findall() {
		List<StudentEntity> list = studentRepository.findAll();
		return list;
	}
	
	
	
	

}
