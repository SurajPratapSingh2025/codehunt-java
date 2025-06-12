package com.javaCollec;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueColl {
	public static void main(String args[]) {
		Queue<String> q=new ArrayDeque<>();
		q.add("l1");
		q.add("l2");
		q.add("l3");
		q.add("l4");
		q.add("l5");
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.peek());
		
		
		
	}
}
