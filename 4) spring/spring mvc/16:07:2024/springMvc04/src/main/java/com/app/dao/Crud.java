package com.app.dao;

import java.util.List;

import com.app.model.Cricketer;

public interface Crud {
	
	public String saveData(Cricketer cricketer);
	
	public List<Cricketer> readData();
	
	
}
