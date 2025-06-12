package com.javaCollec;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetColl {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
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
		
		Set<Integer> s1=new TreeSet<>();
		s1.addAll(s);
		System.out.println(s1);
	}

}
