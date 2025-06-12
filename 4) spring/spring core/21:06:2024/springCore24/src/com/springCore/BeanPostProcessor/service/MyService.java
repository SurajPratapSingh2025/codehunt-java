package com.springCore.BeanPostProcessor.service;

import java.util.List;

import com.springCore.BeanPostProcessor.dao.Crud;
import com.springCore.BeanPostProcessor.dto.StudentDTO;
import com.springCore.BeanPostProcessor.model.Student;

public class MyService {
	private Crud crud;
	
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
