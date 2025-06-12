package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.entity.Employee;
import com.app.service.MyService;

@Controller
public class MyController {
	
	@Autowired		//field injection
	private MyService myService;
	
	public String doPost(Employee emp) {
		
		return myService.add(emp);
	}
}
