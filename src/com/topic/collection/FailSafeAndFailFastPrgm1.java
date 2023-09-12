package com.topic.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeAndFailFastPrgm1 {

	public static void main(String[] args) {
//		failSafe();
		failFast();
	}

	private static void failSafe() {
		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Mayur");
		map.put(2, "Nilesh");
		map.put(3, "Sagar");
		for (Map.Entry<Integer, String> value : map.entrySet()) {
			map.remove(1, "Mayur");
			System.out.println(value.getKey() + " and " + value.getValue());
		}
	}

	private static void failFast() {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Mayur");
		map1.put(2, "Nilesh");
		map1.put(3, "Sagar");
		for (Map.Entry<Integer, String> value1 : map1.entrySet()) {
			map1.put(4, "Chokte");
			map1.replace(1, "Mayur");
			System.out.println(value1.getKey() + " and " + value1.getValue());
		}
	}
}
