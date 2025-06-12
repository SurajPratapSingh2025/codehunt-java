package com.javaPolymorphism;

class Thar extends Car{
	public void milage() {
		System.out.println("tharMilage");
	}
	public void speed() {
		System.out.println("tharSpeed");
	}
}
class Bmw extends Car{
	public void milage() {
		System.out.println("bmwMilage");
	}
	public void speed() {
		System.out.println("bmwSpeed");
	}
}

class Car {
	public void milage() {
		System.out.println("milage");
	}
	public void speed() {
		System.out.println("speed");
	}
}

class Garage {
	public void permit(Car car) {
		car.milage();
		car.speed();
	}
}


public class RunTimePoly{
	public static void main(String args[]) {
//		Thar thar=new Thar();
//		thar.milage();
//		thar.speed();
//		Bmw bmw=new Bmw();
//		bmw.milage();
//		bmw.speed();
		
//		Car car=new Thar();
//		car.milage();
//		car.speed();
//		car=new Bmw();
//		car.milage();
//		car.speed();
		
		Garage garage=new Garage();
		Thar thar=new Thar();
		garage.permit(thar);
		Bmw bmw=new Bmw();
		garage.permit(bmw);
	}
}
