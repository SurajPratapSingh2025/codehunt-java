package java.basics01;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		System.out.print("Enter the first number(M): ");
		Scanner obj=new Scanner(System.in);
		int m=obj.nextInt();
		System.out.print("Enter the second number(N): ");
		int n=obj.nextInt();
		System.out.println("Before Swapping: M= "+m+", N= "+n);
		int temp;
		temp=m;
		m=n;
		n=temp;
		System.out.println("After Swapping: M= "+m+", N= "+n);
		obj.close();
	}
}
