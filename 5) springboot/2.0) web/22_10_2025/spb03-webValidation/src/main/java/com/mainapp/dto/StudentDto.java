package com.mainapp.dto;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Table(name="student")
public class StudentDto {
	@Id
	private int rollno;
	
	@NotBlank(message="fullname should not be empty")
	@Size(min=3, message="your name is too short")
	@Size(max=20, message="your name is too long")
	private String fullname;
	
	@NotBlank(message="course should not be empty")
	@Size(min=3, max=30, message="invalid fullname length")
	private String course;
	
	private float fee;
	
	@NotBlank(message="college should not be empty")
	@Size(min=3, max=30, message="invalid college length")
	private String college;
	
	@NotBlank(message="address should not be empty")
	@Size(min=5, max=30, message="invalid address length")
	private String address;
	
	public StudentDto() {
		
	}
	public StudentDto(int rollno, String fullname, String course, float fee, String college, String address) {
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
