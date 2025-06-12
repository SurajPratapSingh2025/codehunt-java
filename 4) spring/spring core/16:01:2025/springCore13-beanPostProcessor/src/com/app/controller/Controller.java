package com.app.controller;

import com.app.service.MyService;

import lombok.Setter;

@Setter
public class Controller {
	
	private MyService service;
	
	public void doPost() {
		System.out.println("Test Controller");
		service.testService();
	}
	
}
