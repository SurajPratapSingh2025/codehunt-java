package java.basics01;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		System.out.print("Enter the first number(M): ");
		Scanner obj=new Scanner(System.in);
		int m=obj.nextInt(); //5
		System.out.print("Enter the second number(N): ");
		int n=obj.nextInt(); //10
		System.out.println("Before Swapping: M= "+m+", N= "+n);
		m=m+n;
		n=m-n;
		m=m-n;
		System.out.println("After Swapping: M= "+m+", N= "+n);
		obj.close();
	}
}
