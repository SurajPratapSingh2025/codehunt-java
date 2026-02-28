package com.mainapp;

public class Car {
	private long price=23232;
	private String model="rax500";
	
	static {
		System.out.println("Car bean loading ");
	}
	public Car() {
		System.out.println("Car bean instatiation with zero-arg");
	}
	public Car(long price, String model) {
		super();
		this.price = price;
		this.model = model;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
