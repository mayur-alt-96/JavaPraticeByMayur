package com.topic.collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeAndFailFastPrgm {

	public static void main(String[] args) {

		failFast();
//		failSafe();
		

	}

	private static  void failSafe() {

		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Sagar");
		map.put(2, "Nilesh");
		map.put(3, "Nikhil");
		for (Map.Entry<Integer, String> values : map.entrySet()) {
			map.remove(1, "Sagar");
			map.put(3, "Mayur");
			map.put(4, "Mayur");
			System.out.println(values.getKey() + " and " + values.getValue());
		}
	}

	private static void failFast() {
		Map<Integer, String> map = new ConcurrentHashMap<>();
//		if (null!= map) {
		map.put(1, "Sagar");
		map.put(2, "Nilesh");
		map.put(3, "Nikhil");
//		}

		for (Map.Entry<Integer, String> values : map.entrySet()) {
			map.put(4,"SS");
//			map.remove(3, "Nikhil");
			map.put(3, "Mayur");
			System.out.println(values.getKey() + " and " + values.getValue());
		}
	}

}

// whenever you put data into map then interanally modcount in hashmap will get increase . 
//when you try to iterate that modcount variable will store that value into some other variable and if you are try to remove element from map while iteration modcount value 
//will get changes and it will not match with the variable(int mc) then it will throw concurrentmodificaton exception.
//
//ex-  if (modCount != mc)
//    throw new ConcurrentModificationException();
//}



//fail safe- to achive fail fast we use ConcurrentHashMap .
//Differnce between map and concurrent hashmap.
//
//map --> while iterating its put lock on complete map (all backets).
//concurrentHashMap --> while iteration its put lock on single segment.