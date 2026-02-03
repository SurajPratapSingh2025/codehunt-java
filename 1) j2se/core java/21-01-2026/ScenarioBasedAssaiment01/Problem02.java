package java.basics01;

import java.util.Scanner;

public class Problem02 {
	public static void main(String []args) {
		System.out.print("Enter the temperature: ");
		Scanner obj=new Scanner(System.in);
		int temp=obj.nextInt();
		if(temp>0) {
			System.out.println(temp+"*C is a Positive Temperature");
		}else if(temp<0){
			System.out.println(temp+"*C is a Negative Temperature");
		}else {
			System.out.println(temp+"*C is a Netural Temperature");
		}
		obj.close();
	}
}
