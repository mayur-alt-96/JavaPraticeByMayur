package com.topic.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		addingObjectByLinkedMap();
	}

	private static void addingObjectByLinkedMap() {
//		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		HashMap<Integer, String> map = new HashMap<>();
		map.put(3, "Sagar");
		map.put(5, "Chokte");
		map.put(2, "Aai");
		map.put(6, "Baba");
		map.put(1, "Mayur");
		for (Map.Entry<Integer, String> data : map.entrySet()) {
			System.out.println("Key is " + data.getKey() + " and Value is " + data.getValue());
		}
	}
}
