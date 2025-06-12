package com.springCore.ConstructorDI;

public class Student {
	private Account account;
	private String url;

	public Student(Account account,String url) {
		super();
		this.account=account;
		this.url=url;
	}
	
	public void printDetails() {
		System.out.println("URL= "+url);
		account.accInfo();
	}
	
}
