package com.javaCollec;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueColl {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(123);
		pq.add(900);
		pq.add(766);
		pq.add(5);
		pq.add(500);
		pq.add(99);
		pq.add(345);
		pq.add(12);
		pq.add(1);
		pq.add(1000);
		
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.peek());
		
	}
	
}
