package com.springCore.SetterDI;

import java.util.Map;

public class Student {
	private Account account;
	private String url;
	private Map<String,String> driverName;	//Map of string(own impl)
	

	public void setAccount(Account account) {
		this.account = account;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setDriverName(Map<String, String> driverName) {
		this.driverName = driverName;
	}
	
	
	public Account getAccount() {
		return account;
	}
	public String getUrl() {
		return url;
	}
	public Map<String,String> getDriverName() {
		return driverName;
	}
	
	
	@Override
	public String toString() {
		return "Student [account=" + account + ", url=" + url + ", driverName=" +driverName+"]";
	}
	
	
}
