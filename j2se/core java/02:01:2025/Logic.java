package com.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Logic {
	
	//calling static method from another static mehtod
//	public static void main(String[] args) {
//		System.out.println("Logic 1");
//		main();
//	}
//	public static void main() {
//		System.out.println("Logic 2");
//	}
	
	
	//print msg without main
//	public static void main(String[] args) {
//		
//	}
//	static{
//		System.out.println("I love my india");
//	}

	
	//print msg without semicolon
//	public static void main(String[] args) {
//		for(int i=1; i<=2; System.out.println("Hello World")) {
//			i++;
//		}
//	}
	
	
	//give String parameter in main method
//	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//	}
	
	
	//4 digit Random Number Generation
//	public static void main(String[] args) {
//		Random random = new Random();
//		System.out.println(random.nextInt(9000)+1000);
//	}
	
	
	//encoding & decoding
//	public static void main(String[] args) {
//		//encoding
//		String s="Hello";
//		String e = Base64.getEncoder().encodeToString(s.getBytes());
//		System.out.println(e);
//		
//		//decoding
//		byte[] decode = Base64.getDecoder().decode(e);
//		String string=new String(decode);
//		System.out.println(string);
//	}
	
	
	//(list/2)*5 => accending sorting
//	public static void main(String[] args) {
//		List<Integer> list=Arrays.asList(2,1,9,4,7,6,7,8,3);
//		list.stream().filter(n->n%2==0).map(n->n*5).sorted().forEach(n->System.out.println(n));
//	}
	
	
	//runtime creating object through Reflection API
//	public static void main(String[] args) throws Exception {
//		Scanner scan=new Scanner(System.in);
//		System.out.print("Enter Class Name: ");
//		String name=scan.nextLine();
//		
//		Class<?> myclass = Class.forName(name);
//		Object newInstance=myclass.newInstance();
//		System.out.println(newInstance);
//	}
	
}
