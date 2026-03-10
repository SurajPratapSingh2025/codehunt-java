package com.mainapp.dto.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccDto {
	private String accno;
	private String bankName;
	private String ifsc;
	private String address;
	private String employeeId;
}
