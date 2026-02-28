package com.mainapp;

public class Car{
	
	private int price;
	private String model;
	
	static {
		System.out.println("Car bean loading ");
	}
	public Car() {
		System.out.println("Car bean instatiation with zero-arg");
	}
	public Car(int price, String model) {
		super();
		this.price = price;
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
