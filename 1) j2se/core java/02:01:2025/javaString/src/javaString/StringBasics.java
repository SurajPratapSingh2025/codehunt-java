package javaString;

import java.util.Scanner;

public class StringBasics {
	public static void main(String[] args) {
		String s1="Raju";				//Constant Pool
		String s2=new String("Raju");	//Non Constant Pool
//		if(s1==s2) {			//check storing area
//			System.out.println("Equal");
//		}else {
//			System.out.println("UnEqual");//unequal
//		}
		
		//check only string value
//		if(s1.equals(s2)) {
//			System.out.println("Equal"); //equal
//		}else {
//			System.out.println("UnEqual");
//		}
		
		//check only string value
//		if(s1==s2.intern()) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("UnEqual");//unequal
//		}
		
//		String s1="Raju";				//Constant Pool
//		String s2="Raju";				//Constant Pool
//		if(s1==s2) {
//			System.out.println("Equal");	//equal
//		}else {
//			System.out.println("UnEqual");
//		}
		
//		String s1=new String("Raju");	//Non Constant Pool
//		String s2=new String("Raju");	//Non Constant Pool
//		if(s1==s2) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("UnEqual");//unequal
//		}
		
		//multi string inputing after int problem
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Roll: ");
		int roll=scan.nextInt();					//nextInt() bydefault, left linebreak(\n)
		scan.nextLine();							//consumes linebreak & clear the input buffer
		System.out.print("Enter Full Name: ");	
		String s=scan.nextLine();					//Now,wait for actual inputing
		System.out.println("");
		System.out.print("Inputing Roll: "+roll);
		System.out.print("\nInputing Name: "+s);
		
		//Q) Why nextLine() using after nextInt() ?
		//Ans:: It uses beacuase to consume the leftover newline character, that remains in the input 					buffer after reading an integer. 
		
		
	}
}
