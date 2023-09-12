package com.topic.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPrgm {
	public static void main(String[] args) {
		
	 // Adding Number and Name
		addingMethod();
	}

	private static void addingMethod() {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + "- " + m.getValue());
		}
	}
}
