package com.springCore.BeanInheritance;

import java.util.List;

public class Google {
	private int id;
	private String headOffice;
	private List<String> listOfServiceCountry;
	private String extra;
	public Google(int id, String headOffice, List<String> listOfServiceCountry, String extra) {
		super();
		this.id = id;
		this.headOffice = headOffice;
		this.listOfServiceCountry = listOfServiceCountry;
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "Google [id=" + id + ", headOffice=" + headOffice + ", listOfServiceCountry=" + listOfServiceCountry
				+ ", extra=" + extra + "]";
	}
	
	
	
	
}
