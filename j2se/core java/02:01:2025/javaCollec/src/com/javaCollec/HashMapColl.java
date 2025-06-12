package com.javaCollec;

import java.util.HashMap;
import java.util.Map;

public class HashMapColl {
	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(5, "rohan");
		m.put(7, "pratik");
		m.put(9, "dinesh");
		m.put(20, "hari");
		m.put(12, "hitesh");
		
		System.out.println(m);
	}
}
