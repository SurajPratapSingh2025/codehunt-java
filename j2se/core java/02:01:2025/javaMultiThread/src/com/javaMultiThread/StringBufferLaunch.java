package com.javaMultiThread;

//synchronized method
class Account1 extends Thread{
	
	private StringBuffer xyz=new StringBuffer("pqr");	//mutable
	
	public void change() {
		xyz=xyz.append("a");
	}
	
	public void get() {
		int count=0;
		for(char c: xyz.toString().toCharArray()) {
			if(c=='a')
				count++;
		}
		System.out.println(count);
	}
	
}

class Cards extends Thread{
	private Account1 account;
	
	public Cards(Account1 account) {
		this.account=account;
	}

	//card1 card2
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println(name);
		
		for(int i=1; i<=100000; i++) {
			account.change();
		}
	}
	
	
}

public class StringBufferLaunch {
	public static void main(String[] args) throws Exception{
		
		Account1 account = new Account1();
		
		Cards card1 = new Cards(account);
		Cards card2 = new Cards(account);
		
		card1.setName("Card1");
		card2.setName("Card2");
		
		card1.start();
		card2.start();
		
		card1.join();
		card2.join();
		
		account.get();
	}
}
