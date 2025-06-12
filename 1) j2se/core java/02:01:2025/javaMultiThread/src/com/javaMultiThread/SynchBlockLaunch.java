package com.javaMultiThread;

//synchronized block
class Account2 extends Thread{
	
	private StringBuffer xyz=new StringBuffer("pqr");	//mutable
	
	private int change=0;
	private int k=0;
	
	public void change() {
		xyz=xyz.append("a");	//card1 or card2
		synchronized(this) {
			change++;	//Race Condition
		}
		k++;
	}
	
	public void get() {
		int count=0;
		for(char c: xyz.toString().toCharArray()) {
			if(c=='a')
				count++;	
		}
		System.out.println("Count= "+count);
		System.out.println("Value of Change= "+change);
		System.out.println("Value of K= "+k);
		System.out.println("Thread Overlap= "+(change - k));
	}
	
}

class Card$ extends Thread{
	private Account2 account;
	
	public Card$(Account2 account) {
		this.account=account;
	}

	//card1 card2
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println(name);
		
		for(int i=1; i<=500000; i++) {
			account.change();
		}
	}
	
	
}

public class SynchBlockLaunch {
	public static void main(String[] args) throws Exception{
		
		Account2 account = new Account2();
		
		Card$ card1 = new Card$(account);
		Card$ card2 = new Card$(account);
		
		card1.setName("Card1");
		card2.setName("Card2");
		
		card1.start();
		card2.start();
		
		card1.join();
		card2.join();
		
		account.get();
	}
}
