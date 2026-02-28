package com.mainapp;

public class Account {
	private int an;
	private String bank;
	public Account(int an, String bank) {
		super();
		this.an = an;
		this.bank = bank;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	static {
		System.out.println("account loading");
	}
	public Account() {
		System.out.println("account instantiation");
	}
}
