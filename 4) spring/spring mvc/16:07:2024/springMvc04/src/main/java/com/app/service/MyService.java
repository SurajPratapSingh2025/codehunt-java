package com.app.service;

import java.util.List;

import com.app.model.Cricketer;

public interface MyService {
	
	public String saveData(Cricketer cricketer);


	public List<Cricketer> readAllData();
	
}
