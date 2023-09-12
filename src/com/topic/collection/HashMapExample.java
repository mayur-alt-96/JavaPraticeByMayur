package com.topic.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		addingObjectMap();
	}

	private static void addingObjectMap() {
		HashMap<Integer, String> map = new HashMap<>();
		
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		
//		Map<Integer , String> map = new TreeMap<>();
		
		map.put(1, "Mayur");
		map.put(4, "Nilesh");
		map.put(3, "Sagar");
		map.put(5, "Chokte");
		map.put(2, "Aai");
		map.put(6, "Baba");
		map.put(1, "Nikhil");
		map.put(1, "Neha");
		map.put(null, "Payal");
		map.put(null, "Shruti");
		for (Map.Entry<Integer, String> value : map.entrySet()) {
			System.out.println("Key is " + value.getKey() + " and Value is " + value.getValue());
		}
	}
}
