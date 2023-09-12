package com.mayur.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SyncronizeHashMap {

	public static void main(String[] args) {

		java.util.Map<Integer, String> fruitMap = new HashMap<>();

		fruitMap.put(1, "Mango");
		fruitMap.put(2, "Banana");
		fruitMap.put(3, "Apple");
		fruitMap.put(4, "Strawberry");
		fruitMap.put(5, "Pinapple");

		 Map<Integer, String> map = Collections.synchronizedMap(fruitMap);
		 
		map.put(6, "Coconut");

		for (Entry<Integer, String> value : fruitMap.entrySet()) {
			System.out.println("The Key: " + value.getKey() + " and Value: " + value.getValue());
		}
	}
}
