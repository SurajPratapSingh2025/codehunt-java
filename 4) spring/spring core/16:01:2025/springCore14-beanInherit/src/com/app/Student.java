package com.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	//data taken from IOC
	private int countryCode;
	private String countryName;
	private String policy;
	//data taken from user
	private int roll;
	private String sname;
}
