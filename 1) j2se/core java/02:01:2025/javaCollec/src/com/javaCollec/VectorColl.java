package com.javaCollec;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorColl {
	public static void main(String args[]) {
		Vector<String> a=new Vector<>();
		a.add("list1");
		a.add("list2");
		a.add("list3");
		a.add("list4");
		a.add("list5");
		System.out.println(a);
		//a.listIterator()

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
//		a.clear();
//		System.out.println(a);
//		
//		List<String> a1=new Vector<>();
//		a1.add("Ram");
//		a1.add("Dinesh");
//		
//		System.out.println(a.addAll(a1));
//		System.out.println(a);
		
		Iterator<String> it=a.iterator();
//		System.out.println(it.next());
		System.out.println(it.toString());
	}
}
