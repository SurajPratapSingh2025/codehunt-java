package com.app.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmployeeDTO {
	
	@Size(min=2, max=30, message="NAME SIZE VALIDATION ERROR")
	private String name;
	@Size(min=5, max=100, message="ADDRESS SIZE VALIDATION ERROR")
	private String address;
	@Min(value=1000, message="SALARY MUST BE 1000 OR ABOVE")
	@Max(value=10000, message="SALARY MUST BE 1000 OR BELOW")
	private Integer salary;
	
}
