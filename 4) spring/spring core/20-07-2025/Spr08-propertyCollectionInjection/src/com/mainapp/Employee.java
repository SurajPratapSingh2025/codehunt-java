package com.mainapp;

import java.util.Properties;

public class Employee{
	
	private Properties properties;
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	public Employee(Properties properties) {
		super();
		this.properties = properties;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
}
