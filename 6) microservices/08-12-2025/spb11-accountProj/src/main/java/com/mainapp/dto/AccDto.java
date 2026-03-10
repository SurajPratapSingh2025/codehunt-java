package com.mainapp.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccDto {
	@NotBlank(message="Account Number can be empty")
	@Pattern(regexp="\\d{16}",message="Account must be exactly 16 digits")
	private String accno;
	@NotBlank(message="Bank Name can be empty")
	@Size(min=3,max=30,message="Bank Name must be in b/w 3 to 30 chars")
	private String bankName;
	@NotBlank(message="ifsc can't be empty")
	private String ifsc;
	@NotBlank(message="Address can be empty")
	@Size(min=5,max=100,message="Address must be in b/w 5 to 100 chars")
	private String address;
	@NotBlank(message="Employee Id can be empty")
	private String employeeId;
}
