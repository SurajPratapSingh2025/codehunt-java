package com.jdbc.statement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {
	private final int INSERT=1;
	private final int READ=2;
	private final int UPDATE=3;
	private final int DELETE=4;
	private final int EXIT=5;
	
	private static final int MAX_ATTEMPT=3;
	
	private Crud crud;
	
	private String username;
	private String password;
	private String fullname;
	private String address;
	private int salary;
	
	public Logic(){
		crud=new Crud();
	}
	
	public void toStart() {
		
		
		while(true) {
			System.out.println("===================MENU===================");
			System.out.println("Press-1 Insert Data");
			System.out.println("Press-2 Read Data");
			System.out.println("Press-3 Update Data");
			System.out.println("Press-4 Delete Data");
			System.out.println("Press-5 Exit\n");
			
			Scanner obj=new Scanner(System.in);
			System.out.print("Enter Your Choice: ");
			int choice=0;
			int attempt=0;
			
			try {
				choice=obj.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("********Pls Input Only Number i.e. from 1 to 5********");
				attempt++;
				if(attempt >= MAX_ATTEMPT) {
					System.out.println("********Maximum Limit Reached, Better Luck Next Time!********");
					obj.close();
					return;
				}
				continue;
			}
			
			if(choice < 1 || choice > 5) {
				System.out.println("********Pls input correct value i.e. from 1 to 5********");
				attempt++;
				
				if(attempt >= MAX_ATTEMPT) {
					System.out.println("********Maximum Limit Reached, Better Luck Next Time!********");
					obj.close();
					return;
				}
			}
			
			switch (choice) {
				case INSERT:
					System.out.println("----------Insert Data----------");
					System.out.println("Enter Username: ");
					username=obj.next();
					System.out.println("Enter Pasword: ");
					password=obj.next();
					System.out.println("Enter Full Name: ");
					obj.nextLine();
					fullname=obj.nextLine();
					System.out.println("Enter Address: ");
					address=obj.next();
					System.out.println("Enter Salary: ");
					salary=obj.nextInt();
					
					EmployeeDTO employeeDTO = new EmployeeDTO(username, password, fullname, address, salary);
					
					
					
					crud.insert(employeeDTO);
					break;
				case READ:
					System.out.println("------------Read Data-------------");
					
					System.out.print("Enter Username: ");
					username=obj.next();
					
					System.out.print("Enter Password: ");
					password=obj.next();
					
					crud.read(username, password);
					break;
				case UPDATE:
					System.out.println("------------Update Data------------");
					
					System.out.print("Enter Username: ");
					username=obj.next();
					
					System.out.print("Enter Salary: ");
					salary=obj.nextInt();
					
					crud.update(username, salary);
					break;
				case DELETE:
					System.out.println("------------Delete Data------------");
					
					System.out.print("Enter Username: ");
					username=obj.next();
					
					
					crud.delete(username);
					break;
				case EXIT:
					System.out.println("Exit\n");
					obj.close();
					return;
					
				

				}
			}//loop close
		
		}
}
