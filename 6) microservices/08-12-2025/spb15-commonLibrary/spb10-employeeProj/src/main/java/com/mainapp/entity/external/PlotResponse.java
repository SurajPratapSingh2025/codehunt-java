package com.mainapp.entity.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlotResponse {
	private String id;
	private String area;
	private String coloneyName;
	private String cityName;
	private int pincode;
	private String employeeId;
	private String datetime;
}
