package com.javaCollec;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeColl {
	public static void main(String args[]) {
		Deque<String> q=new ArrayDeque<>();
		q.addFirst("l1");
		q.addFirst("l2");
		q.addFirst("l3");
		q.addLast("l4");
		q.addLast("l5");
		q.addLast("l6");
		System.out.println(q);
		
		
//		System.out.println(q.pollFirst());
//		System.out.println(q);
//		System.out.println(q.pollLast());
//		System.out.println(q);
		
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		
		
	}
}
