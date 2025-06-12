package com.app.entity;
//Entity Class

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name="yemployee")
public class Employee {
	@Id
	@Column(name="id")
	private int eid;
	@Column(name="name", length=50)
	private String ename;
	@Column(name="address", length=100)
	private String eaddress;
	@Column(name="salary")
	private int esalary;
	
	
}
