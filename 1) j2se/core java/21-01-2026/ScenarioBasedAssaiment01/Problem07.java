package java.basics01;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		System.out.print("Enter the first value: ");
		Scanner obj=new Scanner(System.in);
		int fir=obj.nextInt();
		System.out.print("Enter the second value: ");
		int sec=obj.nextInt();
		if(fir==sec) {
			System.out.println("Both values are equal. Validation successful.");
		}else {
			System.out.println("Values are NOT equal. Please re-verify the data.");
		}
		obj.close();
	}
}
