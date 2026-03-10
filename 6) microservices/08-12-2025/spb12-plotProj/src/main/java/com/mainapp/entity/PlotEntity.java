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
@Table(name="plotproj")
public class PlotEntity {
	@Id
	private String id;
	@Column(length=20)
	private String area;
	@Column(length=50)
	private String coloneyName;
	@Column(length=20)
	private String cityName;
	private int pincode;
	private String employeeId;
	private String datetime;
}
