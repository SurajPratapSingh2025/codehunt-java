package com.javaMultiThread;

//One class, Multiple Thread
class Tables implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		
		if(name.equalsIgnoreCase("raju")) {
			five(); System.out.println(name);
		}else if(name.equalsIgnoreCase("kaju")) {
			seven(); System.out.println(name);
		}else {
			eleven(); System.out.println(name);
		}
		
		
	}
	
	
	
	public void five() {
		for(int i=1; i<=10; i++) {
			System.out.println(5+" * "+i+" = "+5*i);
		}
	}
	
	public void seven() {
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
	
	public void eleven() {
		for(int i=1; i<=10; i++) {
			System.out.println(11+" * "+i+" = "+11*i);
		}
	}
	
	
}

public class RunnableLaunch{
	public static void main(String[] args) throws Exception {
		
		Runnable r1=new Tables();
		Runnable r2=new Tables();
		Runnable r3=new Tables();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		
		t1.setName("raju");
		t2.setName("kaju");
		t3.setName("maju");
		
		t1.start();
		t2.start();
		t3.start();
		
		//five.join();
		
		System.out.println("Table Print");
	}
}
