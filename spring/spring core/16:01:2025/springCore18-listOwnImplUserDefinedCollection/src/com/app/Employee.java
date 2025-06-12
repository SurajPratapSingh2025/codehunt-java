package com.app;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Employee {
	
	//user
    private int eid;
    private String ename;
    private String eaddress;
    //ioc
    private List<Account> defaultListOfAccounts;
    
    //only used in case of constructor-arg
    public Employee(List<Account> defaultListOfAccounts) {
    	super();
        this.defaultListOfAccounts = defaultListOfAccounts;
    }
}
    
    
    
    
    
    
    
    
