package com.javaPolymorphism;

class Car1 {
	public void m1() {
		System.out.println("m1->a");
	}
	public void m1(int i) {
		System.out.println("m1->b");
	}
	public void m1(char c) {
		System.out.println("m1->c");
	}
	public void m1(float f) {
		System.out.println("m1->d");
	}
	public void m1(double f) {
		System.out.println("m1->e");
	}
	public void m1(String s) {
		System.out.println("m1->f");
	}
}

public class CompileTimePoly {
	public static void main(String[] args) {
		Car1 car=new Car1();
		car.m1(5.0f);
	}

}
