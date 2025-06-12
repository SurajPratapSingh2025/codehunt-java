package com.app;

import java.util.Map;

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
    private Map<String,String> mapOfBooks;
    
    //only used in case of constructor-arg
    public Employee(Map<String,String> mapOfBooks) {
        this.mapOfBooks = mapOfBooks;
    }
}