package com.app;

import java.util.List;
import java.util.Map;

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
    private int id;
    private String name;
    private String address;
    //ioc
    private Map<String,Account> mapOfAccounts;	//key->predefined, value->userdefined
    
    //only used in case of constructor-arg
    public Employee(Map<String,Account> mapOfAccounts) {
    	super();
        this.mapOfAccounts = mapOfAccounts;
    }
}
    
    
    
    
    
    
    
    
