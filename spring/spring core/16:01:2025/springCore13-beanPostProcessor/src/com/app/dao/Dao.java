package com.app.dao;

import javax.annotation.PostConstruct;

public class Dao {
	
	private String connection;
	
	@PostConstruct
	public String init() {
		String connection="Connection Estabilished";
//		this.connection=connection;
//		return connection;
		this.connection=null;
		return null;
	}

	public void testDao() {
		System.out.println("Test DAO "+connection);
		
	}

}
