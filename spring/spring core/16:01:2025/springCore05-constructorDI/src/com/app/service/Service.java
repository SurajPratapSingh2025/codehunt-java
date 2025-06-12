package com.app.service;

import com.app.dao.Dao;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Service {
	
	private Dao dao;		//dependency
	
	public void test1() {
		System.out.println("Service test1");
		dao.test1();
	}
	
	public void test2() {
		System.out.println("Service test2");
		dao.test2();
	}
}
