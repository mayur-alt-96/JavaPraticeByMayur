package com.topic.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPrgm {
	public static void main(String[] args) {

		// Adding Number and Name
//		addingMethod();
		addingTreeMethod();
	}

	private static void addingTreeMethod() {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(3, "Sagar");
		map.put(5, "Chokte");
		map.put(2, "Aai");
		map.put(6, "Baba");
		map.put(1, "Mayur");
		for (Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println("Key is " + data.getKey() +" and Value is "+data.getValue());

		}
	}

	private static void addingMethod() {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		map.put(103, "Nilesh");
		map.put(null, "Nilesh1");
		map.put(null, "Nilesh2");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println("Key is " + m.getKey() + " and values is " + m.getValue());
		}
	}
}
