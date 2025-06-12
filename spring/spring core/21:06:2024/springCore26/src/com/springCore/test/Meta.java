package com.springCore.test;

import org.springframework.stereotype.Component;

@Component

public class Meta {
	static {
		System.out.println("Meta bean loading....");
	}
	public Meta() {
		System.out.println("Meta bean instantiation");
	}
}
