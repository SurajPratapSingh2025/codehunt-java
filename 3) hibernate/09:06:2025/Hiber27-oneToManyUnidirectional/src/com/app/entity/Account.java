package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
	@Id
	private String accNo;
	private String accountHolderName;
	private String accountHolderAddress;
	private String bankName;
	private String ifsc;

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accountHolderName=" + accountHolderName + ", accountHolderAddress="
				+ accountHolderAddress + ", bankName=" + bankName + ", ifsc=" + ifsc + "]";
	}

}
