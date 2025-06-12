package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.app.entity.Employee;
import com.app.repository.MyRepository;

@Controller
public class MyServiceImpl implements MyService{
	
	@Autowired
	@Qualifier("repo1")														//field injection
	private MyRepository myRepository;
	
	
//	@Autowired
//	@Qualifier("repo2")
//	public void setMyRepository(MyRepository myRepository) {				//setter Injection
//		System.out.println("**************************************");
//		this.myRepository=myRepository;
//	}
	
	
//	@Autowired
//	public MyServiceImpl(@Qualifier("repo2") MyRepository myRepository) {	//constructor injection
//		super();
//		System.out.println("======================================");
//		this.myRepository=myRepository;
//	}
	
	
	@Override
	public String add(Employee emp) {
		
		
		
		return myRepository.add(emp);
	}

}
