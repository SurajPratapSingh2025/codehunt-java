package com.mainapp;

public class Tv {
	private String show;
	
	static {
		System.out.println("Tv bean loading ");
	}
	public Tv() {
		System.out.println("Tv bean instatiation with zero-arg");
	}

	public Tv(String show) {
		super();
		this.show = show;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}
}
