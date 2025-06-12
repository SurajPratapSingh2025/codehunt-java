package com.app;

public class EmpBean{
	
	private String companyCode;
	
	static {
		System.out.println("Bean Loading");
	}
	public EmpBean(String companyCode) {
		this.companyCode=companyCode;
		System.out.println("Bean Instantiation");
	}
	
	public void test() {
		System.out.println("Bean Custom Method "+companyCode);
	}
	
	
}
