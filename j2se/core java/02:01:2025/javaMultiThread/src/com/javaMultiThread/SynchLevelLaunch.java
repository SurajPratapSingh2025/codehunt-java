package com.javaMultiThread;

//Level of Synchronization
class User extends Thread{
	
	private Resource resource;
	
	public User(Resource resource) {
		this.resource=resource;
	}

	@SuppressWarnings("static-access")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		try {
			resource.printer1(name);
			resource.printer2(name);
			resource.printer3(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


class Resource{
	
	//object level lock
	public synchronized void printer1(String name) throws Exception {
		for(int i=0; i<10; i++) {
			System.out.println(name+" Using Printer1");
			Thread.sleep(1000);
		}
	}
	
	//class level lock by using Static Method
	public static synchronized void printer2(String name) throws Exception {
		for(int i=0; i<10; i++) {
			System.out.println(name+" Using Printer2");
			Thread.sleep(1000);
		}

	}
	
	public void printer3(String name) throws Exception {
//		synchronized(this) {
//			for(int i=0; i<10; i++) {
//				System.out.println(name+" Using Printer3");
//				Thread.sleep(1000);
//			}
//		}
		
		//Class Level Lock by using Custom Block
		synchronized(Resource.class) {
			for(int i=0; i<10; i++) {
				System.out.println(name+" Using Printer3");
				Thread.sleep(1000);
			}
		}

	}
}




public class SynchLevelLaunch {
	public static void main(String[] args) throws Exception {
		Resource resource1=new Resource();
		Resource resource2=new Resource();
		
		User u1 = new User(resource1);
		User u2 = new User(resource2);
		
		u1.setName("User1");
		u2.setName("User2");
		
		u1.start();
		u2.start();
		
	}
}

