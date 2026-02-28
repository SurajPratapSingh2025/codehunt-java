package com.mainapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
//@Lazy
//@Scope("prototype")
public class Employee{
	
	@Autowired
	private Car car;
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	public Employee(Car car) {
		super();
		this.car = car;
		System.out.println("****************USE CONSTRUCTOR****************");
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
		System.out.println("************USE SETTER************");
	}
	
}
