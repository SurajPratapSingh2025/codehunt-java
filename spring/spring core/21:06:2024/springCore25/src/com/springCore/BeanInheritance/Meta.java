package com.springCore.BeanInheritance;

import java.util.List;
import java.util.Map;

public class Meta {
	private int id;
	private String headOffice;
	private List<String> listOfServiceCountry;
	private Map<String,String> empEmailName;
	
	
	
	public Meta(int id, String headOffice, List<String> listOfServiceCountry, Map<String, String> empEmailName) {
		super();
		this.id = id;
		this.headOffice = headOffice;
		this.listOfServiceCountry = listOfServiceCountry;
		this.empEmailName = empEmailName;
	}



	@Override
	public String toString() {
		return "Meta [id=" + id + ", headOffice=" + headOffice + ", listOfServiceCountry=" + listOfServiceCountry + "]";
	}



	
	
	
	
}
