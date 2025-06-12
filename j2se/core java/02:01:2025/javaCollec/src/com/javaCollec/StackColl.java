package com.javaCollec;

import java.util.Stack;
import java.util.List;

public class StackColl {
	public static void main(String args[]) {
		Stack<String> a=new Stack<>();
		a.push("list1");
		a.push("list2");
		a.push("list3");
		a.push("list4");
		a.push("list5");
//		System.out.println(a);

		System.out.println(a.pop());
		System.out.println(a);
		
		System.out.println(a.search("list3"));
		
		System.out.println(a.peek());
		
		System.out.println(a.empty());
		System.out.println(a);
		
//		a.add(1, "list2");
//		System.out.println(a);
		
//		System.out.println(a.get(1));
		
//		System.out.println(a.set(1, "list2"));
//		System.out.println(a);
		
//		System.out.println(a.size());
//		a.clear();
//		System.out.println(a);
		
//		Stack<String> a1=new Stack<>();
//		a1.push("Ram");
//		a1.push("Dinesh");
//		
//		System.out.println(a.addAll(a1));
//		System.out.println(a);
	}
}
