package com.springCore.Autowired.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springCore.Autowired.dao.Crud;
import com.springCore.Autowired.dto.StudentDTO;
import com.springCore.Autowired.model.Student;

@Service
public class MyService {
	private Crud crud;
	
	@Autowired
	public void setCrud(Crud crud) {
		this.crud=crud;
	}
	
	public void myServiceSaveImpl(StudentDTO dto) {
		crud.saveMyData(dto);
	}
	
	public List<Student> myServiceReadImpl() {
		return crud.readMyData();
	}
}
