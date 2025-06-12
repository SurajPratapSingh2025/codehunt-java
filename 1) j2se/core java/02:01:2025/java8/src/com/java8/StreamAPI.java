package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12,1,812,102,2);
		
//		Stream<Integer> stream = asList.stream();
//		Stream<Integer> map = stream.map(n->n*2);
//		map.forEach(n->System.out.println(n));
		
		asList.stream().map(n->n*2).forEach(n->System.out.println(n));
		
		
		
	}
}
