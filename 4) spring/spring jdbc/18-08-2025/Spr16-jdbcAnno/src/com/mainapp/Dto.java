package com.mainapp;

import org.springframework.stereotype.Component;

@Component
public class Dto {
	
	private int rollno;
	private String fullname;
	private String course;
	private float fee;
	private String college;
	private String address;
	
	//setter
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public void setFullname(String fullname) {
		this.fullname=fullname;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public void setFee(float fee) {
		this.fee=fee;
	}
	public void setCollege(String college) {
		this.college=college;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	//getter
	public int getRollno() {
		return rollno;
	}
	public String getFullname() {
		return fullname;
	}
	public String getCourse() {
		return course;
	}
	public float getFee() {
		return fee;
	}
	public String getCollege() {
		return college;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Dto [rollno=" + rollno + ", fullname=" + fullname + ", course=" + course + ", fee=" + fee + ", college="
				+ college + ", address=" + address + "]";
	}
}
