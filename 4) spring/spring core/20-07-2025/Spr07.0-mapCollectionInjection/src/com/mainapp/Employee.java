package com.mainapp;

import java.util.Map;

public class Employee{
	
	private Map<String,String> bank;
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	public Employee(Map<String, String> bank) {
		super();
		this.bank = bank;
	}
	public Map<String, String> getBank() {
		return bank;
	}
	public void setBank(Map<String, String> bank) {
		this.bank = bank;
	}
	
}
