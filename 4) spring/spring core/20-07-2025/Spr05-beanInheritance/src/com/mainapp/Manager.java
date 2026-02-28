package com.mainapp;

public class Manager{
	
	private int code;
	private String name;
	private int mid;
	
	static {
		System.out.println("Manager bean loading ");
	}
	public Manager() {
		System.out.println("Manager bean instatiation with zero-arg");
	}
	@Override
	public String toString() {
		return "Manager [code=" + code + ", name=" + name + ", mid=" + mid + "]";
	}
	public Manager(int code, String name, int mid) {
		super();
		this.code = code;
		this.name = name;
		this.mid = mid;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
}
