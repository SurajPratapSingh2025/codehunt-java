package com.springCore.SetterDI;

import java.util.List;

public class Student {
	private String url;
	private List<Account> accInfo;	//list of "user defined object"
	
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void setAccInfo(List<Account> accInfo) {
		this.accInfo = accInfo;
	}
	
	
	public String getUrl() {
		return url;
	}
	public List<Account> getAccInfo() {
		return accInfo;
	}
	
	
	@Override
	public String toString() {
		return "Student [url=" + url + ", accInfo=" + accInfo + "]";
	}
	

}
