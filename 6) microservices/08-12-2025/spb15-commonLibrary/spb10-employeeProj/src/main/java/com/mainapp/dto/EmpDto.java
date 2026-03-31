package com.mainapp.dto;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDto {
	@NotBlank(message="name not should be blank")
	@Size(min=3,max=30,message="name must be in b/w 3 to 30 chars")
	private String name;
	@NotBlank(message="address not should be blank")
	@Size(min=5,max=100,message="address must be in b/w 5 to 50 chars")
	private String address;
	@DecimalMin(value="1000.0",message="salary must be above 1000.0")
	@DecimalMax(value="50000.0", message="salary must be below 50000.0")
	private double salary;
}
