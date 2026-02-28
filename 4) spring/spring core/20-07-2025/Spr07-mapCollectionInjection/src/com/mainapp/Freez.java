package com.mainapp;

public class Freez {
	private String cloth;
	
	static {
		System.out.println("Freez bean loading ");
	}
	public Freez() {
		System.out.println("Freez bean instatiation with zero-arg");
	}
	
	public Freez(String cloth) {
		super();
		this.cloth = cloth;
	}

	public String getCloth() {
		return cloth;
	}

	public void setCloth(String cloth) {
		this.cloth = cloth;
	}
	
}
