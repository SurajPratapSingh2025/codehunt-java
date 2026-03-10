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
@Table(name="accproj")
public class AccEntity {
	@Id
	private String id;
	@Column(unique=true,length=16)
	private String accno;
	@Column(length=30)
	private String bankName;
	private String ifsc;
	@Column(length=100)
	private String address;
	private String employeeId;
	private String datetime;
}
