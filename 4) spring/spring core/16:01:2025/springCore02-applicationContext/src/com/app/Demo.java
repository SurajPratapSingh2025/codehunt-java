package com.app;

public class Demo {
	
	static {
		System.out.println("Demo Class Loading");
	}
	
	public Demo() {
		System.out.println("Demo Class Instantiation");
	}
	
	public int test() {
		
		System.out.println("Demo Test Done.");
		
		return 1000;
	}
	
}
