package com.app.entity;
//Entity Class

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
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
@NamedQuery(name="deleteJPQL", query="delete from Employee where eid>=:eid")
@NamedNativeQuery(name="deleteSQL", query="delete from yemployee where id>=:id")
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
	
	public Employee(int eid, String ename) {		//for only for specific read like(//select id name where name like 'r%' and id>40)
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	
}
