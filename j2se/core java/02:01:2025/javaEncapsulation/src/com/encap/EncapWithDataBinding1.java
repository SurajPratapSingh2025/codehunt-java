package com.encap;

import java.util.Scanner;

//Data Binding & Data Hiding
class Student{
	private int roll;
	private String name;	//Implementing Data Hiding
	private char gender;
	private float semFee;
	private long mobile;		//Implementing Data Hiding
	
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
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", gender=" + gender + ", semFee=" + semFee + ", mobile="
				+ mobile + "]";
	}
	
	
}


public class EncapWithDataBinding1 {
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
		Student student = new Student();
		student.setRoll(roll);
		student.setName(name);
		student.setGender(gender);
		student.setSemFee(semFee);
		student.setMobile(mobile);
		
		//calling toString()
		System.out.println(student);
	}
}
