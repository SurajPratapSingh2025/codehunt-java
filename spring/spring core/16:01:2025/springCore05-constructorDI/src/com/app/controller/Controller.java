package com.app.controller;

import com.app.service.Service;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Controller {
	
	private Service service;	//dependency
	
	public void doPost() {
		System.out.println("controller post");
		service.test1();
	}
	
	public void doGet() {
		System.out.println("controller get");
		service.test2();
	}
	
}
