package com.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.Crud;

@Service
public class MyServiceImpl implements MyService{
	private Crud crud;
	
	@Autowired
	public void setCrud(Crud crud) {
		this.crud=crud;
	}
}
