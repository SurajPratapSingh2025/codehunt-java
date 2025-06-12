package com.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12,1,812,102,2);
		
		//from iterator	=> Imperative Style of Coding
//		Iterator<Integer> iterator = asList.iterator();
//		while(iterator.hasNext())
//			System.out.println(iterator.next());
		
		
		//from foreach
//		Consumer<Integer> consumer = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//				
//			}};
//		asList.forEach(consumer);
		
		
		//from labmda
//		Consumer<Integer> consumer=t->System.out.println(t);
//		asList.forEach(consumer);

//		asList.forEach(t->System.out.println(t));
		
		
		//5 times increase 
//		int index=0;
//		for(Integer i:asList) {
//			asList.set(index,i*5);
//			index++;
//		}
//		System.out.println(asList);
//		//then extract even & also calculate sum
//		int sum=0;
//		for(Integer i:asList) {
//			if(i%2==0) {
//				System.out.println(i);
//				sum +=i;
//			}
//		}
//		System.out.println(sum);
		
		
		//from stream api
		asList.stream().map(t->t*5).sorted().filter(t->t%2==0).forEach(t->System.out.println(t));
		//for sum
		Integer reduce = asList.stream().map(t->t*5).sorted().filter(t->t%2==0).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		//for count
		long count = asList.stream().map(t->t*5).sorted().filter(t->t%2==0).count();
		System.out.println(count);
		
		
	}
}
