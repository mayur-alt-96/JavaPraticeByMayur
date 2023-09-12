package com.topic.collection;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetPrgm {

	public static void main(String[] args) {

		// Adding Number
//		addingNumberMethod();

		// Adding Name in order
//		addingNameMethod();

		addingMethod();

	}

	private static void addingMethod() {
		Set<Object> set = new LinkedHashSet<>();
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
		Set<Integer> set = new LinkedHashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(3);
		set.add(4);
		set.add(5);
		for (Integer name : set) {
			System.out.println("Name in order is " + name);
		}
	}

	private static void addingNumberMethod() {
		Set<String> set = new LinkedHashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		for (String value : set) {
			System.out.println("Number in word is " + value);
		}
		System.out.println();
	}
}
