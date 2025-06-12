package javaArray;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		
		//array initialization
//		int arr[][]= {{1,2,3},{4,5},{6}};
//		int arr[][]=new int[3][];
//		arr[0][0]=1; arr[0][1]=2; arr[0][2]=3;
//		arr[1][0]=4; arr[0][1]=5;
//		arr[2][0]=6;
		
		//user inputing
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter dept: ");
		int dept=scan.nextInt();
		
		int arr[][]=new int[dept][];	//since std varies in each dept

		System.out.println(" ");
		for(int i=0; i<dept; i++) {
			System.out.print("Dept= "+i+", Enter No. of Std: ");
			int eachStd=scan.nextInt();
			
			arr[i]=new int[eachStd];
			
			//for entering value
			for(int j=0; j<eachStd; j++) {
				System.out.print("Dept= "+i+", Std= "+j+" Enter Value: ");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println(" ");
		
		//display jagged array
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++)
				System.out.println("Dept: "+i+" Std: "+j+" Value: "+arr[i][j]);
		}
	}
}
