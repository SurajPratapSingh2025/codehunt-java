package com.mainapp;

public class Emp {
		
	static {
		System.out.println("emp bean loading..");
	}
	public Emp() {
		System.out.println("emp bean instantiation");
	}
	public void test() {
		System.out.println("test by application ");
	}
}
