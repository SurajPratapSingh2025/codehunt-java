package com.springCore.SetterDI;

public class Student {
	private Account account;
	private String url;


	public void setAccount(Account account) {
		this.account = account;
		this.url=url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printDetails() {
		System.out.println("URL= "+url);
		account.accInfo();
	}
	
}
