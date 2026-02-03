package java.basics01;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		System.out.print("Enter the ticket number: ");
		Scanner obj=new Scanner(System.in);
		int tn=obj.nextInt();
		if(tn%5==0) {
			System.out.println("Ticket number "+tn+" is VALID. It is divisible by 5.");
		}else {
			System.out.println("Ticket number "+tn+" is INVALID. It is not divisible by 5.");
		}
		obj.close();
	}
}
