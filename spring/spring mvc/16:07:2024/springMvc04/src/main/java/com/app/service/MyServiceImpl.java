package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.app.dao.Crud;
import com.app.model.Cricketer;

@Service
public class MyServiceImpl implements MyService{
	
	
	private Crud crud;
	private MyService myService;
	
	@Autowired
	public void setCrud(Crud crud) {
		this.crud=crud;
	}
	
	@Override
	public String saveData(Cricketer cricketer) {
		
		return crud.saveData(cricketer);
	}

	@Override
	public List<Cricketer> readAllData() {
		
		
		
		return crud.readData();
	}

	

	
}
