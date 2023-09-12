package com.topic.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPrgm {

	public static void main(String[] args) {

		// Adding number
		addingNumberMethod();

		// Adding name in order
		addingNameMethod();

		// Adding name and number
//		addingMethod();
	}

	private static void addingMethod() {
		Set<Object> set = new TreeSet<>();
		set.add("Vjay");
		set.add(12);
		set.add("Ajay");
		set.add("Mayur");
		set.add(1);
		set.add(12);
		set.add(2);
		set.add("Sagar");
		set.add("Mayur");

		for (Object object : set) {
			System.out.println("In order is " + object);
		}
	}

	private static void addingNameMethod() {
		Set<String> set = new TreeSet<>();
		set.add("Mayur");
		set.add("Nilesh");
		set.add("Mayur");
		set.add("Sagar");
		set.add("Ajay");
		for (String name : set) {
			System.out.println("Name is " + name);
		}
		System.out.println();
	}

	private static void addingNumberMethod() {
		Set<Integer> set = new TreeSet<>();
		set.add(11);
		set.add(15);
		set.add(1);
		set.add(9);
		set.add(7);
		set.add(3);
		set.add(1);
		for (Integer value : set) {
			System.out.println("Number is " + value);
		}
		System.out.println();
	}
}
