package com.app.entity;
//Entity Class

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor			//for select statement
@AllArgsConstructor			//for non-select statement
public class Employee {
	
	private int eid;
	
	private String ename;
	
	private String eaddress;
	
	private int esalary;
	
	
}
