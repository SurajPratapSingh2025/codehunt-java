package com.springCore.JavaDI;

public class Launch {
	public static void main(String[] args) {
		Account account = new Account();
		
		Student std = new Student();
		std.setAccount(account);
		
		std.printDetails();
	}
}
