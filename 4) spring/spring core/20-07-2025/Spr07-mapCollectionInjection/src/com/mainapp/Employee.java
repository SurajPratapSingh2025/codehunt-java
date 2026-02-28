package com.mainapp;

import java.util.Map;

public class Employee{
	
	private Map<Tv,Freez> bank;
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	public Employee(Map<Tv, Freez> bank) {
		super();
		this.bank = bank;
	}
	public Map<Tv, Freez> getBank() {
		return bank;
	}
	public void setBank(Map<Tv, Freez> bank) {
		this.bank = bank;
	}
	
	
}
