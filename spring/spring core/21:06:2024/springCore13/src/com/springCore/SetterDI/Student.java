package com.springCore.SetterDI;

import java.util.List;

public class Student {
	private Account account;
	private String url;
	private List<String> databaseInfo;	//list of string
	

	public void setAccount(Account account) {
		this.account = account;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setDatabaseInfo(List<String> databaseInfo) {
		this.databaseInfo = databaseInfo;
	}
	
	
	public Account getAccount() {
		return account;
	}
	public String getUrl() {
		return url;
	}
	public List<String> getDatabaseInfo() {
		return databaseInfo;
	}
	
	
	@Override
	public String toString() {
		return "Student [account=" + account + ", url=" + url + ", databaseInfo=" +databaseInfo+"]";
	}
	
	
}
