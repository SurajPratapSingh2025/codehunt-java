package com.javaAbstraction;

abstract class Payment2{
	abstract void send();
	abstract void check();
	abstract void miniStmt();
	abstract void last5Trs();
}

class Gpay2 extends Payment2{
	@Override
	public void send() {
		System.out.println("Gpay Send");
	}
	@Override
	public void check() {
		System.out.println("Gpay Check");
	}
	@Override
	public void miniStmt() {
		System.out.println("Gpay miniStmt");
	}
	@Override
	public void last5Trs() {
		System.out.println("Gpay last5Trans");
		
	}
	
}

class ObjectFactory1{
	public static Payment2 getObject(int key) {
		if(key==1111)
			return new Gpay2();
		else 
			return null;
	}
}

public class AbstractionWithFactoryAbstractClass {
	public static void main(String[] args) {
//		Payment2 p=new Gpay2();
		Payment2 p=ObjectFactory1.getObject(1111);
		p.send();
		p.check();
		p.miniStmt();
		p.last5Trs();
	}
}
