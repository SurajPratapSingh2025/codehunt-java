package com.java8;

// inner class
interface Xyz{
	public abstract void toPrint();
}

//class Abc implements Xyz{
//
//	@Override
//	public void toPrint() {
//		System.out.println("Abc class");
//	}
//	
//}

public class FunctionalInt {
	public static void main(String[] args) {
//		Xyz abc = new Abc();
//		abc.toPrint();
		
//		new Abc().toPrint();
		
		//Inner Class
//		Xyz xyz=new Xyz() {
//
//			@Override
//			public void toPrint() {
//				System.out.println("Inner Classes");
//			}
//			
//		};
//		xyz.toPrint();
		
		
		//In shortcut of inner classes
//		new Xyz() {public void toPrint() {System.out.println("Inner class");}}.toPrint();
		
		//using lambda
		Xyz xyz= () ->System.out.println("Inner Class");
		xyz.toPrint();
	}
}
