package com.javaCollec;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetColl {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		s.add(100);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(40);
		s.add(5);
		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println(s);
		
	}

}
