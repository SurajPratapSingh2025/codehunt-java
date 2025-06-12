package com.app.entity;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

@Data
public class EmployeeDTO {
	
	
	@Min(value = 10, message="ID SHOULD NOT BE LESS THAN 10")
	@Max(value=99, message="ID SHOULD NOT BE GREATER THAN 99")
	private int id;
	@Size(min=2, max=30, message="INVALID NAME LENGTH(MIN-2 | MAX-30)")
	@NotBlank(message="NAME CANNOT BE BLANK")
	@NotEmpty(message="NAME CANOT BE EMPTY")
	@Pattern(regexp="^[A-Za-z\\s]+$", message="ONLY ALPHABETS ARE ALLOWED")
	private String name;
	@Size(min=5,max=100,message="INVALID ADDRESS LENGTH (MIN-5 | MAX-100)")
	private String address;
	@Min(value = 1000, message="SALARY SHOULD NOT BE LESS THAN 1000")
	@Max(value=5000, message="SALARY SHOULD NOT BE GREATER THAN 5000")
	private int salary;
	@NotNull(message="DATE CAN't BE NULL")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	
	private String myfile;
}

