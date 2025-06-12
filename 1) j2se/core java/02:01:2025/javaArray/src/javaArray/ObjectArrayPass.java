package javaArray;

import java.util.Scanner;

class Dept{
	public int[] dis(int dept) {
		int arr[]=new int[dept];
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter Value: ");
			arr[i]=scan.nextInt();
		}
		System.out.print("User Array: ");
		return arr;
	}
}
public class ObjectArrayPass {
	public static void main(String[] args) {
		Dept dept=new Dept();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size=scan.nextInt();
		int []res=dept.dis(size);
		System.out.println(" ");
		for(int k:res) System.out.print(k+" ");
	}
}
