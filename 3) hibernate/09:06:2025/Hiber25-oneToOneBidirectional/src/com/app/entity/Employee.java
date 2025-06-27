package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="accNo")
	private Account account;
}
