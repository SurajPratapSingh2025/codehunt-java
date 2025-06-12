package javaArray;

import java.util.Scanner;

public class OneDarray {
	public static void main(String[] args) {
		
		//array initialization
//		int arr[]= {10,11,12,13,14}; 
//		int arr[]= new int[] {10,11,12,13,14}; 
		int arr[]=new int[5]; arr[0]=10; arr[1]=11; arr[2]=12; arr[3]=13; arr[4]=14;
		
		Scanner scan=new Scanner(System.in);
		
		//user inputing
//		System.out.println("Enter array size: ");
//		int size=scan.nextInt();
//		int arr[]=new int[size];
//		for(int i=0; i<arr.length; i++) {System.out.print("Enter "+i+" array: "); arr[i]=scan.nextInt();}
		for(int k:arr)System.out.print(k+" ");
		
		//Display even element in array
//		for(int k:arr)if(k%2==0) System.out.print(k+" ");
		
		//Display Reverse array
//		for(int i = arr.length-1; i>=0; i--) System.out.print(arr[i]+" ");
	}
}
