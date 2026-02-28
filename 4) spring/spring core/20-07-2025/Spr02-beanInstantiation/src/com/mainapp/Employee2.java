package com.mainapp;

import java.util.UUID;

public class Employee2 {
	//dependency inject
	private String id;
	private static Account account;
	public Employee2(String id, Account account) {
		super();
		this.id = id;
		this.account = account;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	static {
		System.out.println("bean loading ");
	}
	public Employee2() {
		System.out.println("bean instatiation with zero-arg");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static Employee2 getObject() {
		Employee2 employee1 = new Employee2();
		employee1.setId(UUID.randomUUID().toString());
//		employee1.setAccount(new Account(28,"bank"));
		employee1.setAccount(account);
		return employee1;
	}
}
