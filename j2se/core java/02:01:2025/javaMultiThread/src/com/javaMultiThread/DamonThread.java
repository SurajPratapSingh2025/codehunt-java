package com.javaMultiThread;

class Messages{
	private String message;
	private boolean messageSent;
	
	public synchronized void sendMessage(String message, String name){
		System.out.println(name+" send method........");
		while(messageSent==true) {
			try {
				System.out.println(name+" send method while........");
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
		notifyAll();
	}
	
	public synchronized void readMessage(String name){
		
		System.out.println(name+" read method........");
		while(messageSent == false) {
			try {
				System.out.println(name+" read method while........");
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
		notifyAll();
	}
}

class User$ extends Thread{
	private Messages message;
	
	public User$(Messages message) {
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


public class DamonThread {
	public static void main(String[] args) {
		Messages message = new Messages();
		
		User$ u1 = new User$(message);
		User$ u2 = new User$(message);
		User$ u3 = new User$(message);
		
		u1.setName("raju");
		u2.setName("kaju");
		u3.setName("maju");
		
		u1.start();
		u2.start();
		u3.start();
	}
}

