package com.mainapp.dto.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlotDto {
	private String area;
	private String coloneyName;
	private String cityName;
	private int pincode;
	private String employeeId;
}
