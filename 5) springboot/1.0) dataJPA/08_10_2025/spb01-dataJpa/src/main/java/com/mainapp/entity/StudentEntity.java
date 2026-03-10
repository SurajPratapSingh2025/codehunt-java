package com.mainapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	private int rollno;
	private String fullname;
	private String course;
	private float fee;
	private String college;
	private String address;
	
	public StudentEntity() {
		
	}
	public StudentEntity(int rollno, String fullname, String course, float fee, String college, String address) {
		super();
		this.rollno = rollno;
		this.fullname = fullname;
		this.course = course;
		this.fee = fee;
		this.college = college;
		this.address = address;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentEntity [rollno=" + rollno + ", fullname=" + fullname + ", course=" + course + ", fee=" + fee
				+ ", college=" + college + ", address=" + address + "]";
	}
}
