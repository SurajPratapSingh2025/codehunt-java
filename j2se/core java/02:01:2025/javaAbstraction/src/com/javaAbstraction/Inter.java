package com.javaAbstraction;

interface MyInterface{
	void speed();
	void milage();
}

class Bmw implements MyInterface{

	@Override
	public void speed() {
		System.out.println("Bmw Speed");
		
	}
	@Override
	public void milage() {
		System.out.println("Bmw milage");
		
	}
	
}
class Thar implements MyInterface{

	@Override
	public void speed() {
		System.out.println("Thar speed");
		
	}
	@Override
	public void milage() {
		System.out.println("Thar milage");
		
	}
	
}

public class Inter {
	public static void main(String[] args) {
		//from polymorphism
//		MyInterface bmw = new Bmw();
//		bmw.speed();
//		bmw.milage();
//		new Thar().speed();
//		new Thar().milage();
		
		test(new Bmw());
		test(new Thar());
	}
	
	public static void test(MyInterface i) {
		i.speed();
		i.milage();
	}
}
