package com.javaMultiThread;

//multiple class, multiple thread
class Five extends Thread{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" Five");
		for(int i=1; i<=10; i++) {
			System.out.println(5+" * "+i+" = "+5*i);
		}
	}
	
}
class Seven extends Thread{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println(name+" Seven");
		for(int i=1; i<=10; i++) {
			System.out.println(7+" * "+i+" = "+7*i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadLaunch{
	public static void main(String[] args) throws Exception {
		Five five=new Five();
		Seven seven=new Seven();
		
		seven.start();
		five.start();
		
//		five.join();
//		seven.join();
		
		System.out.println("Table Print");
	}
}
