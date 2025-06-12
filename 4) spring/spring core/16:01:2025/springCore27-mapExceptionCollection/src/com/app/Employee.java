package com.app;

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
    private Map<Integer,Account> mapOfAccounts;	//key->predefined, value->userdefined
    
    //only used in case of constructor-arg
    public Employee(Map<Integer,Account> mapOfAccounts) {
    	super();
        this.mapOfAccounts = mapOfAccounts;
    }
}
    
    
    
    
    
    
    
    
