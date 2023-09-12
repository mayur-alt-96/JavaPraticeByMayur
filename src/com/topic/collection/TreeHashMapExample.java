package com.topic.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapExample {

	public static void main(String[] args) {

		addingObjectByTreeMap();
	}

	private static void addingObjectByTreeMap() {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(3, "Sagar");
		map.put(5, "Chokte");
		map.put(2, "Aai");
		map.put(6, "Baba");
		map.put(1, "Mayur");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println("Key is " + m.getKey() + " and value is " + m.getValue());
		}
	}
}
