package java.basics01;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] args) {
		System.out.print("Enter the passcode: ");
		Scanner obj=new Scanner(System.in);
		int pass=obj.nextInt();
		int d,cnt=0;
		int rev=0;
		while(pass>0) {
			d=pass%10;
			cnt++;
			rev=rev*10 +d;
			pass=pass/10;
		}
		for(int i=1;i<=cnt;i++) {
			d=rev%10;
			System.out.println("Digits at position "+i+" : "+d);
			rev=rev/10;
		}
		obj.close();
	}
}
