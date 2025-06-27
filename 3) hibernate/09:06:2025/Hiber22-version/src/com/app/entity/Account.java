package com.app.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Account {
	
	private String accNo;
	private String accountHolderName;
	private String accountHolderAddress;
	private String bankName;
	private String ifsc;

}
