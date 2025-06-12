package com.app;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Account {
	//user having multiple account in multiple bank
	private int an;
	private String aname;
	//ioc
	private List<Account> setOfAccounts;
	
	public Account(int an, String aname) {
	    this.an = an;
	    this.aname = aname;
	}

	
}



