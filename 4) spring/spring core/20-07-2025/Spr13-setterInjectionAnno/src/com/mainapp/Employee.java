package com.mainapp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
//@Lazy
//@Scope("prototype")
public class Employee{
	private int id;
	private Car car;
	private Map<String,String> books;
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	public Employee(int id, Car car, Map<String, String> books) {
		super();
		this.id = id;
		this.car = car;
		this.books = books;
		System.out.println("*************Inject => Constructor**************");
	}

	public int getId() {
		return id;
	}
	@Autowired
	public void setId(int id) {
		this.id = id;
		System.out.println("*************Inject => Id Setter**************");
	}

	public Car getCar() {
		return car;
	}
	@Autowired
	public void setCar(Car car) {
		this.car = car;
		System.out.println("*************Inject => car Setter**************");
	}

	public Map<String, String> getBooks() {
		return books;
	}
	@Autowired
	public void setBooks(Map<String, String> books) {
		this.books = books;
		System.out.println("*************Inject => map setter**************");
	}
	
}
