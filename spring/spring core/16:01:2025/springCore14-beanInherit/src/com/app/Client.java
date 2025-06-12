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
public class Client {
	
	//data taken from IOC
	private int countryCode;
	private String countryName;
	private String policy;
	//data taken from user
	private int cid;
	private String cname;
}
