package java.basics01;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int d,s=0;
		while(n>0) {
			d=n%10;
			s=s+d;
			n=n/10;
		}
		System.out.println("Sum of Digits: "+s);
		obj.close();
	}
}
