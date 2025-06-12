package com.springCore.SetterDiAutowiring;

import java.util.List;

public class Student {
	private Account accinfo;
	private Car car;
	private List<String> listOfBooks;
	
	
	public void setAccinfo(Account accinfo) {
		this.accinfo = accinfo;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public void setListOfBooks(List<String> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	
	public Account getAccinfo() {
		return accinfo;
	}
	public Car getCar() {
		return car;
	}
	public List<String> getListOfBooks() {
		return listOfBooks;
	}
	
	
	@Override
	public String toString() {
		return "Student [accinfo=" + accinfo + ", car=" + car + ", listOfBooks=" + listOfBooks + "]";
	}
	
	
}
