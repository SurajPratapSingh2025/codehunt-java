package com.javaAbstraction;

interface Payment1{
	void send();
	void check();
	void miniStmt();
	void last5Trs();
}

class Gpay1 implements Payment1{
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

class ObjectFactory{
	public static Payment1 getObject(int key) {
		if(key==1111)
			return new Gpay1();
		else 
			return null;
	}
}

public class AbstractionWithFactoryInterface {
	public static void main(String[] args) {
//		Payment1 p=new Gpay1();
		Payment1 p=ObjectFactory.getObject(1111);
		p.send();
		p.check();
		p.miniStmt();
		p.last5Trs();
	}
}
