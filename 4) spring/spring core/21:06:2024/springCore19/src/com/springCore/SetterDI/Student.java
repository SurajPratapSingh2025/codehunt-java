package com.springCore.SetterDI;

import java.util.Map;

public class Student {
	private String url;
	private Map<String,Account> accinfo;	//Map of object
	
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setAccinfo(Map<String, Account> accinfo) {
		this.accinfo = accinfo;
	}
	
	
	public String getUrl() {
		return url;
	}
	public Map<String, Account> getAccinfo() {
		return accinfo;
	}
	
	
	@Override
	public String toString() {
		return "Student [url=" + url + ", accinfo=" + accinfo + "]";
	}
	
	
	
}
