package com.mainapp;

import java.util.List;

public class Employee{
	
	private int account;
	private List<String> bank;
	private Car car;
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	public Employee(int account, List<String> bank, Car car) {
		super();
		this.account = account;
		this.bank = bank;
		this.car = car;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public List<String> getBank() {
		return bank;
	}
	public void setBank(List<String> bank) {
		this.bank = bank;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
}
