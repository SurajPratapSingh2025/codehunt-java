package com.app;

import java.util.Map;

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
	private Map<String,Account> mapOfAccounts;
	
	public Account(int an, String aname) {
	    this.an = an;
	    this.aname = aname;
	}

	
}



