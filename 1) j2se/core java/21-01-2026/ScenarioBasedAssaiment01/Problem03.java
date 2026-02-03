package java.basics01;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		System.out.print("Enter marks of Subject1: ");
		Scanner obj=new Scanner(System.in);
		int sub1=obj.nextInt();
		System.out.print("Enter marks of Subject2: ");
		int sub2=obj.nextInt();
		System.out.print("Enter marks of Subject3: ");
		int sub3=obj.nextInt();
		if(sub1>sub2 && sub1>sub3) {
			System.out.println("The highest score is "+sub1);
		}else if(sub2>sub3 && sub2>sub1) {
			System.out.println("The highest score is "+sub2);
		}else if(sub3>sub1 && sub3>sub2){
			System.out.println("The highest score is "+sub3);
		}else {
			System.out.println("All scores are equal: "+sub1);
		}
		obj.close();
	}
}
