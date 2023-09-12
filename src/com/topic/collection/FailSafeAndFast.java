package com.topic.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeAndFast {

	public static void main(String[] args) {

//		failSafe();
//		failFast();
		
//		using Hashtable
		failSafe1();

	}

	private static void failSafe1() {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "Mayur");
		ht.put(2, "Nilesh");
		ht.put(3, "Neha");
		ht.put(4, "Sagar");
		ht.put(5, "Nilima");

		for (Map.Entry<Integer, String> entry : ht.entrySet()) {
			ht.remove(1, "Mayur");
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static void failSafe() {
		Map<Integer, String> map = new ConcurrentHashMap<>();
//		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Sagar");
		map.put(2, "Nilesh");
		map.put(3, "Mayur");
		for (Map.Entry<Integer, String> mapDetail : map.entrySet()) {
			map.put(5, "Mayur");
			map.put(4, "Mayur");
//			for (Map.Entry<Integer, String> mapDetail : map.entrySet()) {
			System.out.println("Key is " + mapDetail.getKey() + " and value is " + mapDetail.getValue());
		}
	}

	private static void failFast() {
		Map<Integer, String> map = new ConcurrentHashMap<>();
//		Map<Integer, String> map = new HashMap<>();
		if (map.size() == 0) {
			map.put(1, "Sagar");
			map.put(2, "Nilesh");
//			map.put(3, "Mayur");
			for (Map.Entry<Integer, String> mapDetail : map.entrySet()) {
				map.put(4, "Dev");
				System.out.println("Key is " + mapDetail.getKey() + " and value is " + mapDetail.getValue());
			}
		} else {
			System.out.println("Map does not contained more than 4 value");
		}
	}
}
