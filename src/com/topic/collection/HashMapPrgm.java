package com.topic.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrgm {

	public static void main(String[] args) {
		
	 // Adding Number and Fruits
		addingMethod();
	}

	private static void addingMethod() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(5, "Mango");
		map.put(6, "Fruits");
		for (Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}
}