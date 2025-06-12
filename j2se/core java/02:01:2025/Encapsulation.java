package com.encap;

import java.util.Scanner;

class Car {
	public void display(Student student) {
//		System.out.println("Roll= "+roll);
//		System.out.println("Age= "+age);
//		System.out.println("Gender= "+gender);
//		System.out.println("Physcial C.= "+pc);
//		System.out.println("Percentage= "+pcmPer);
		
//		System.out.println("Roll= "+student.roll);
//		System.out.println("Age= "+student.age);
//		System.out.println("Gender= "+student.gender);
//		System.out.println("Physcial C.= "+student.pc);
//		System.out.println("Percentage= "+student.pcmPer);
		
		student.printData();
	}
}

class Student {
	private int roll;
	private int age;
	private char gender;
	private String pc;
	private float pcmPer;
	
	public void setData(int roll,int age,char gender,String pc,float pcmPer){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Key: ");
		int key=scanner.nextInt();
		if(key==12345) {
			this.roll=roll;
			this.age=age;
			this.gender=gender;
			this.pc=pc;
			this.pcmPer=pcmPer;
		}
		else {
			System.out.println("Unauthorised User");
		}
	}
	public void printData() {
		
		System.out.println("Roll= "+roll);
		System.out.println("Age= "+age);
		System.out.println("Gender= "+gender);
		System.out.println("Physcial C.= "+pc);
		System.out.println("Percentage= "+pcmPer);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No: ");
		 int roll=sc.nextInt();
		System.out.println("Enter Age: ");
		 int age=sc.nextInt();
		System.out.println("Enter Gender: ");
		 char gender=sc.next().charAt(0);
		System.out.println("Enter Physically Challenged: ");
		 String pc=sc.next();
		System.out.println("Enter Percentage: ");
		 float pcmPer=sc.nextFloat();
		
		Car car=new Car();
//		car.display(age,roll,gender,pc,pcmPer);
		
		Student student=new Student();
//		student.roll=roll;
//		student.age=age;
//		student.gender=gender;
//		student.pc=pc;
//		student.pcmPer=pcmPer;
		student.setData(roll,age,gender,pc,pcmPer);

		car.display(student);

		sc.close();
	}

}
