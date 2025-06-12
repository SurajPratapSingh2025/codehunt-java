package com.springCore.BeanPostProcessor.dto;

public class StudentDTO {
	private int sid;
	private String sname;
	private String saddress;
	private int ssalary;

	
	public StudentDTO(int sid, String sname, String saddress, int ssalary) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.ssalary = ssalary;
	}
	

	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public int getSsalary() {
		return ssalary;
	}
	
	
}
