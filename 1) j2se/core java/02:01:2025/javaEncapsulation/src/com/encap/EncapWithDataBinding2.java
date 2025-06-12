package com.encap;

import java.util.Scanner;

//Data Binding & Data Hiding
class Student1{
	private int roll;
	private String name;	//Implementing Data Hiding
	private char gender;
	private float semFee;
	private long mobile;		//Implementing Data Hiding
	
	//For Setter
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setSemFee(float semFee) {
		this.semFee = semFee;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	//For Getter
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public float getSemFee() {
		return semFee;
	}
	public long getMobile() {
		return mobile;
	}
	
	
}


public class EncapWithDataBinding2 {
	public static void main(String[] args) {
		//user inputing
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Roll: ");
		int roll=scan.nextInt();
		scan.nextLine();			//for clearing buffer
		System.out.print("Enter Name: ");
		String name=scan.nextLine();
		System.out.print("Enter Gender: ");
		char gender=scan.next().charAt(0);
		System.out.print("Enter Sem-Fee: ");
		float semFee=scan.nextFloat();
		System.out.print("Enter Mobile No: ");
		long mobile=scan.nextLong();
		
		//Data Binding
		Student1 student = new Student1();
		student.setRoll(roll);
		student.setName(name);
		student.setGender(gender);
		student.setSemFee(semFee);
		student.setMobile(mobile);
		
		//For Displaying Data
		System.out.println("Roll= "+student.getRoll());
		System.out.println("Name= "+student.getName());
		System.out.println("Gender= "+student.getGender());
		System.out.println("Sem Fee= "+student.getSemFee());
		System.out.println("Mobile No= "+student.getMobile());
	}
}
