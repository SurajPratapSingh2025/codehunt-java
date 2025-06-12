package com.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.app.entity.Employee;

@Component("repo1")
public class MyRepositoryImpl1 implements MyRepository{
	
//	@Value("1000")
	@Value("#{2+100}")			//SPEL
	private int testid;
	
	@Value("ABCD")
	private String testString;
	
//	@Value("#{list}")
	@Value("#{list[0]}")
	private List<String> testList;

	@Override
	public String add(Employee emp) {
		
		System.out.println(emp+" saved successfully "+testid+" | "+testString+" | "+testList);
		return "SUCCESS1";
	}

}
