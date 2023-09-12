package com.topic.collection;

import java.util.HashSet;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		addingObjectBySet();
		addingIntegerBySet();
	}

	private static void addingIntegerBySet() {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(12);
		set.add(14);
		set.add(17);
		set.add(18);
		set.add(13);
		set.add(13);
		set.add(13);
		set.add(13);
		set.add(11);
		for (Integer value : set) {
			System.out.println("The Integer value is "+value);
		}
	}

	private static void addingObjectBySet() {
		HashSet<Object> set = new HashSet<>();
		set.add(10);
		set.add("Sagar");
		set.add(14);
		set.add("Chokte");
		set.add("Nilesh");
		set.add(13);
		set.add("Mayur");
		for (Object value : set) {
			System.out.println("The object value is "+value);
		}
		System.out.println("=============================================");
	}

}
