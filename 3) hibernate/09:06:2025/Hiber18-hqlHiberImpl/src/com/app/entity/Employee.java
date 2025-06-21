package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor			//for select statement
@AllArgsConstructor			//for non-select statement
@Entity
@Table(name="yemployee")
@NamedQuery(name="readAll", query="from Employee")
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