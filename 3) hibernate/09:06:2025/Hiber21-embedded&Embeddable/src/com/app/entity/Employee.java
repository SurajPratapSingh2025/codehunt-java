package com.app.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	@Embedded
	private Company company;
	@Embedded
	private Car car;

	
}
