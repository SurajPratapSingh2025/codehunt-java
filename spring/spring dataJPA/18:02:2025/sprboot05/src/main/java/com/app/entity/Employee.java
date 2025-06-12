package com.app.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;



@Data
@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String address;
	private int salary;
	private LocalDate date;
	private int ucode;			//application generated code
	private String myfile;
	
}
