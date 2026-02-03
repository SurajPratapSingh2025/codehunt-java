package java.basics01;

import java.util.Scanner;

public class Problem01 {
	public static void main(String []args) {
		System.out.print("Enter the registration number: ");
		Scanner obj=new Scanner(System.in);
		int regNo=obj.nextInt();
		if(regNo%2==0) {
			System.out.println(regNo+" is an EVEN number->Assigned to Gate-1");
		}
		if(regNo%2!=0) {
			System.out.println(regNo+" is an ODD number->Assigned to Gate-2");
		}
		obj.close();
	}
}
