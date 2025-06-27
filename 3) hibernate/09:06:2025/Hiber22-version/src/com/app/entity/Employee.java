package com.app.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	@Embedded
	private Company company;
	@Embedded
	private Car car;

	@Version
	private int version;

	public Employee(String employeeId, String employeeName, Company company, Car car) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.company = company;
		this.car = car;
	}
}
