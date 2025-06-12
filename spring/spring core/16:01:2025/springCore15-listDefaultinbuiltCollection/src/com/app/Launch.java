package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e = (Employee)cac.getBean("emp");
		e.setEid(11);
		e.setEname("Raju");
		e.setEaddress("Patna");
		
		
		System.out.println(e);
		System.out.println(e.getDefaultListOfBooks().getClass());
//		
//		//creating a list
//		ArrayList<String> arrayList=new ArrayList<String>();
//		arrayList.add("test1");
//		arrayList.add("test2");
//		arrayList.add("test3");
//		LinkedList<String> linkedList=new LinkedList<String>(arrayList);
//		System.out.println(linkedList);
		
		
//		LinkedList<String> linkedList=new LinkedList<String>(Arrays.asList("Test1","Test2","Test3"));
//		System.out.println(linkedList);
		
		
		
//		cac.close();
	}
}
