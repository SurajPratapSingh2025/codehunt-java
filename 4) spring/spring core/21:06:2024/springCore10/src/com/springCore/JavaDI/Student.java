package com.springCore.JavaDI;

public class Student {
	private Account account;	//null
	

//	public Student(Account account) {
//		this.account=account;
//	}	//Constructor Dependency Injection
	

	public void setAccount(Account account) {
		this.account = account;
	}	//Setter Dependency Injection

	
	public void printDetails() {
		account.accountInfo();	//null.method	=> NullPointerException
	}
}
//Student object is dependent on account