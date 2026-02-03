package java.basics01;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] args) {
		System.out.print("Enter the order ID: ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int d,s=0,t;
		t=n;
		while(n>0) {
			d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println("Sum of digits in order ID "+t+" is: "+s);
		obj.close();
	}
}
