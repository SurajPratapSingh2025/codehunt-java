package com.javaMultiThread;

class Resources extends Thread{
	private String res1="Res1";
	private String res2="Res2";
	private String res3="Res3";
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		
		if(name.equals("raju")){
			try {
				rajuAccess(name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			kajuAccess(name);
		}
	}
	private void rajuAccess(String name) throws Exception {
		synchronized(res1) {
			System.out.println(name+" using "+res1);
			synchronized(res2) {
				System.out.println(name+" using "+res1);
				synchronized(res3) {
					System.out.println(name+" using "+res1);
				}
			}
		}
		
		
	}
	private void kajuAccess(String name) {
		synchronized(res1) {
			System.out.println(name+" using "+res1);
			synchronized(res2) {
				System.out.println(name+" using "+res1);
				synchronized(res3) {
					System.out.println(name+" using "+res1);
				}
			}
		}
	}
	
}


public class Deadlock {
	public static void main(String[] args) {
		
		Resources resource1 = new Resources();
		Resources resource2 = new Resources();
		
		resource1.setName("raju");
		resource2.setName("kaju");
		
		resource1.start();
		resource2.start();
	}
}





