package com.app.controller.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	public Map<Integer,Integer> salesData() {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1996, 2000);
		map.put(1997, 10000);
		map.put(1998, 1000);
		map.put(1999, 5000);
		map.put(2000, 1000);
		map.put(2001, 1000);
		map.put(2002, 7000);
		
		return map;
		
	}
}
