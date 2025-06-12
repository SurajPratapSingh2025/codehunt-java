package com.app.repository;

import org.springframework.stereotype.Component;

import com.app.entity.Employee;

@Component("repo2")
public class MyRepositoryImpl2 implements MyRepository{

	@Override
	public String add(Employee emp) {
		
		System.out.println(emp+" saved successfully");
		return "SUCCESS2";
	}

}
