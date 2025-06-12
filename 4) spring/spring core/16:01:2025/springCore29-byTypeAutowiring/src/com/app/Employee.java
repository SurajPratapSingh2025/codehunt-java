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
    private Account account;
    private List<String> listOfBooks;
    private Adhaar adhaar;
    
    //only used in case of constructor-arg
    public Employee(Account account,List<String> listOfBooks,Adhaar adhaar) {
    	super();
        this.account=account;
        this.listOfBooks=listOfBooks;
        this.adhaar=adhaar;
    }
}
    
    
    
    
    
    
    
    
