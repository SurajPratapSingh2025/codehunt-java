package com.javaAbstraction;

abstract class MyAbstract{
	public MyAbstract(){
		System.out.println("abs 1");
	}
	public abstract void insert();
	public abstract void read();
	public void pqrs() {
		System.out.println("abs 2");
	}
	public void ijkl() {
		System.out.println("abs 3");
	}
}

class Child extends MyAbstract{
	
	public Child() {
		System.out.println("child 1");
	}
	
	//implementing method
	@Override
	public void pqrs() {
		System.out.println("child 2");
		
	}
	
	//unimplementing method
	@Override
	public void insert() {
		System.out.println("child 3");	
	}
	@Override
	public void read() {
		System.out.println("child 4");
		
	}
	
}


public class Abs {
	public static void main(String[] args) {
		MyAbstract ma=new Child();
		ma.insert();
		ma.read();
		ma.pqrs();
		ma.ijkl();
	}
	
}
