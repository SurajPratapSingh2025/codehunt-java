package com.mainapp.entity.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpResponse {
	private String id;
	private String name;
	private String address;
	private double salary;
	private String datetime;
}
