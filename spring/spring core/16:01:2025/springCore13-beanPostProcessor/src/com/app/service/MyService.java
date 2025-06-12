package com.app.service;

import com.app.dao.Dao;

import lombok.Setter;

@Setter
public class MyService {
	
	private Dao dao;
	

	public void testService() {
		System.out.println("Test Service");
		dao.testDao();
	}

}
