package com.javaCollec;

import java.util.ArrayList;
import java.util.List;

public class ArrayListColl {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		@SuppressWarnings("rawtypes")
		List a=new ArrayList();
		a.add("list1");
		a.add("list2");
		a.add("list3");
		a.add("list4");
		a.add("list5");
		a.add(2);
		a.add(4);
//		a.add('o');
//		a.add('k');
		
		for(int i=0; i<a.size(); i++) {
			Object object=a.get(i);
			if(object instanceof String) {
				String name=(String) object;
				System.out.println(name);
			}
			else {
				Integer c=(Integer) object;
				System.out.println(c);
			}
		}
		
//		System.out.println(a);

//		System.out.println(a.remove(1));
//		System.out.println(a);

//		a.add(1, "list2");
//		System.out.println(a);
		
//		System.out.println(a.get(1));
		
//		System.out.println(a.set(1, "list6"));
//		System.out.println(a);
		
//		System.out.println(a.size());
//		a.clear();
//		System.out.println(a);
		
//		System.out.println(a.contains("list20"));
		System.out.println(a.isEmpty());
		
//		List<String> a1=new ArrayList<>();
//		a1.add("Ram");
//		a1.add("Dinesh");
//		
//		System.out.println(a.addAll(a1));
//		System.out.println(a);
	}
}
