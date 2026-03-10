package com.mainapp.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlotDto {
	@NotBlank(message="Area can't be empty")
	@Size(min=2,max=20,message="Area must be in b/w 2 to 20 chars")
	private String area;
	@NotBlank(message="Coloney Name can't be empty")
	@Size(min=10,max=50,message="Coloney Name must be in b/w 10 to 50 chars")
	private String coloneyName;
	@NotBlank(message="City Name can't be empty")
	@Size(min=5,max=20,message="City Name must be in b/w 5 to 20 chars")
	private String cityName;
	@Min(value=100000,message="pincode must be at exactly 6 digit")
	@Max(value=999999,message="pincode must be at exactly 6 digit")
	private int pincode;
	@NotBlank(message="Employee Id can be empty")
	private String employeeId;
}
