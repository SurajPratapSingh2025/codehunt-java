package com.mainapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="empproj")
//public class EmpEntity extends AuditableEntity{
public class EmpEntity{
	@Id
	private String id;
	@Column(length=30)
	private String name;
	@Column(length=100)
	private String address;
	private double salary;
	private String datetime;
}
