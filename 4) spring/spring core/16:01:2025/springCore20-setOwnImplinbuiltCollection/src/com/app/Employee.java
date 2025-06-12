package com.app;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
	
	//user
    private int id;
    private String name;
    private String address;
    //IOC
    private Set<String> setOfDefaultBooks;
    
    //only used in case of constructor-arg
    public Employee(Set<String> setOfDefaultBooks) {
        this.setOfDefaultBooks = setOfDefaultBooks;
    }
}