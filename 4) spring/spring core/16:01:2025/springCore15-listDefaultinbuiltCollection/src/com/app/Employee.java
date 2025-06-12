package com.app;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employee {
    private int eid;
    private String ename;
    private String eaddress;
    private List<String> defaultListOfBooks;
    
    //only used in case of constructor-arg
//    public Employee(List<String> defaultListOfBooks) {
//        this.defaultListOfBooks = defaultListOfBooks;
//    }
}