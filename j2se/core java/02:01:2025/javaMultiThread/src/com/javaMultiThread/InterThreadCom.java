package com.javaMultiThread;

class Message{
	private String message;
	private boolean messageSent;
	
	public synchronized void sendMessage(String message, String name){
		
		while(messageSent==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("MSG Sent: "+message+" by "+name);
		this.message=message;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		messageSent=true;
		notify();
	}
	
	public synchronized void readMessage(String name){
		while(messageSent == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Msg Read: "+message+" by "+name);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		messageSent=false;
		notify();
	}
}

class Users extends Thread{
	private Message message;
	
	public Users(Message message) {
		this.message=message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=getName();
		
		if(name.equals("raju")) {
			
				int i=0;
				while(i<100) {
					message.sendMessage("Good Morning", name);
					i++;
				}
		}else {
			
			int i=0;
			while(i<100) {
				message.readMessage(name);
				i++;
			}
		}
	}
}


public class InterThreadCom {
	public static void main(String[] args) {
		Message message = new Message();
		
		Users u1 = new Users(message);
		Users u2 = new Users(message);
		
		u1.setName("raju");
		u2.setName("kaju");
		
		u1.start();
		u2.start();
		
	}
}

