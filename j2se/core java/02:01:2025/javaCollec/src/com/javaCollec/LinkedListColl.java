package com.javaCollec;

import java.util.LinkedList;
import java.util.List;

public class LinkedListColl {
	public static void main(String args[]) {
		List<String> a=new LinkedList<>();
		a.add("list1");
		a.add("list2");
		a.add("list3");
		a.add("list4");
		a.add("list5");
//		System.out.println(a);

//		System.out.println(a.remove(1));
//		System.out.println(a);
//
//		a.add(1, "list2");
//		System.out.println(a);
//		
//		System.out.println(a.get(1));
//		
//		System.out.println(a.set(1, "list6"));
//		System.out.println(a);
//		
//		System.out.println(a.size());
//		
//		a.clear();
//		System.out.println(a);
		
//		List<String> a1=new LinkedList<>();
//		a1.add("Ram");
//		a1.add("Dinesh");
//		
//		System.out.println(a.addAll(a1));
//		System.out.println(a);
		
		a.notify();
		System.out.println(a);
	}
}
