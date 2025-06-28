package com.app.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
	
//	@ManyToMany(cascade=CascadeType.ALL, mappedBy="employee")
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="empacc",
			joinColumns=@JoinColumn(name="eid"),
			inverseJoinColumns=@JoinColumn(name="accNo")
	)
	private List<Account> account;
}
