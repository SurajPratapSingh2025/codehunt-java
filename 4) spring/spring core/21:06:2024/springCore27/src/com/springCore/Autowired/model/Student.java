package com.springCore.Autowired.model;

public class Student {
	private int sid;
	private String sname;
	private String saddress;
	private int ssalary;
	
	public Student(int sid, String sname, String saddress, int ssalary) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.ssalary = ssalary;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public void setSsalary(int ssalary) {
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
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", ssalary=" + ssalary + "]";
	}
	
	
}
