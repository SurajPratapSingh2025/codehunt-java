package com.mainapp.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainapp.dto.StudentDto;
import com.mainapp.entity.StudentEntity;
import com.mainapp.repository.StudentRepository;

@Service
@Transactional(rollbackOn=Exception.class)
public class MyService {
			
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private StudentRepository studentRepository;
	
    

	public StudentEntity save(StudentDto studentDto) {
		StudentEntity map = modelMapper.map(studentDto, StudentEntity.class);
		map.setId(0);
		map.setDatetime(LocalDateTime.now().toString());
		StudentEntity save = studentRepository.save(map);
		return save;
	}
	
	public List<StudentEntity> findall(){
		return studentRepository.findAll();
	}
		
	public Optional<StudentEntity> findById(int id){
		Optional<StudentEntity> byId = studentRepository.findById(id);
		return byId;
	}
	
	
	//custom query
//	public boolean update(int id, StudentDto studentDto) {
//	    int updatedRows = studentRepository.updateStudent(
//	            id,
//	            studentDto.getRollno(),
//	            studentDto.getFullname(),
//	            studentDto.getCourse(),
//	            studentDto.getFee(),
//	            studentDto.getCollege(),
//	            studentDto.getAddress(),
//	            LocalDateTime.now().toString()
//	    );
//	    return updatedRows > 0;
//	}
	public StudentEntity update(int id, StudentDto studentDto) {
		Optional<StudentEntity> op = studentRepository.findById(id);
		if(op.isPresent()) {
			StudentEntity studentEntity=op.get();
			studentEntity.setRollno(studentDto.getRollno());
			studentEntity.setFullname(studentDto.getFullname());
			studentEntity.setCourse(studentDto.getCourse());
			studentEntity.setFee(studentDto.getFee());
			studentEntity.setCollege(studentDto.getCollege());
			studentEntity.setAddress(studentDto.getAddress());
			studentEntity.setDatetime(LocalDateTime.now().toString());
			StudentEntity save = studentRepository.save(studentEntity);
			return save;
		}
		return null;
		
	}
	
	
	
	//custom query
//	public boolean updateFee(int id, float fee) {
//	    int updatedRows = studentRepository.updateFee(
//	            id,
//	            fee,
//	            LocalDateTime.now().toString()
//	    );
//	    return updatedRows > 0;
//	}
	public StudentEntity updateFee(int id,float fee) {
		Optional<StudentEntity> op = studentRepository.findById(id);
		if(op.isPresent()) {
			StudentEntity studentEntity=op.get();
			studentEntity.setFee(fee);
			studentEntity.setDatetime(LocalDateTime.now().toString());
			StudentEntity save = studentRepository.save(studentEntity);
			return save;
		}
		return null;
	}
	
	
	public StudentEntity updateRollno(int id, int rollno) {
		Optional<StudentEntity> op = studentRepository.findById(id);
		if(op.isPresent()) {
			StudentEntity studentEntity=op.get();
			studentEntity.setRollno(rollno);
			StudentEntity save = studentRepository.save(studentEntity);
			return save;
		}
		return null;
	}
	
	
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}
	
	
	
		
}
