package com.javaCollec;

import java.util.Arrays;
import java.util.List;

public class WildCardGenric {
	private List<String> l1 = Arrays.asList("l1", "l2", "l3");
	private List<Integer> l2 = Arrays.asList(2, 4, 6);

	public List<?> readData(int key) {
		if (key == 1) {
			return l1;
		} else {
			return l2;
		}
	}

	public static void main(String[] args) {
		List<?> data = new Service().readData();
		System.out.println("Returned data: " + data);
	}
}

class Service {
	public List<?> readData() {
		WildCardGenric a = new WildCardGenric();
		return a.readData(1); // returns l1 (Integer list)
	}
}
