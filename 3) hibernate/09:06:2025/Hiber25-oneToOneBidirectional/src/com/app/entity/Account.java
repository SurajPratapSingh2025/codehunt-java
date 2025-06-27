package com.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Account {
	@Id
	private String accNo;
	private String accountHolderName;
	private String accountHolderAddress;
	private String bankName;
	private String ifsc;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee employee;

	public Account(String accNo, String accountHolderName, String accountHolderAddress, String bankName, String ifsc) {
		super();
		this.accNo = accNo;
		this.accountHolderName = accountHolderName;
		this.accountHolderAddress = accountHolderAddress;
		this.bankName = bankName;
		this.ifsc = ifsc;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accountHolderName=" + accountHolderName + ", accountHolderAddress="
				+ accountHolderAddress + ", bankName=" + bankName + ", ifsc=" + ifsc + "]";
	}

}
