package com.javaMultiThread;

//synchronized method
class Account extends Thread{
	
	private int bal=500000;
	
	public synchronized void deduct(int bal, String cardName) {
		this.bal=this.bal - bal;
		System.out.println("Debit Successfully "+cardName);
	}
	public void get() {
		System.out.println(bal);
	}
}

class Card extends Thread{
	private Account account;
	
	public Card(Account account) {
		this.account=account;
	}

	//card1 card2
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println(name);
		
		for(int i=1; i<=100000; i++) {
			account.deduct(2, Thread.currentThread().getName());
		}
	}
	
	
}

public class SynchMethodLaunch {
	public static void main(String[] args) throws Exception{
		
		Account account = new Account();
		
		Card card1 = new Card(account);
		Card card2 = new Card(account);
		
		card1.setName("Card1");
		card2.setName("Card2");
		
		card1.start();
		card2.start();
		
		card1.join();
		card2.join();
		
		account.get();
	}
}
