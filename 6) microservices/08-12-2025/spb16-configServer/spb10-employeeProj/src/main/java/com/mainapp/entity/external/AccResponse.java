package com.mainapp.entity.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccResponse {				//copy of accEntity
	private String id;
	private String accno;
	private String bankName;
	private String ifsc;
	private String address;
	private String employeeId;
	private String datetime;
}
