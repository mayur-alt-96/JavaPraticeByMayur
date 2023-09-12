package com.topic.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetPrgm {

	public static void main(String[] args) {
		// Natural number
//		naturalNumberMethod();

		// Adding Alphabets
//		addingAlphabetMethod();

		// Adding Name
//		addingNameMethod();

		// Adding Prime Number
//		addingPrimeNumber();
//		addingMethod();
		
		addingSet();
		
		
	}

	private static void addingSet() {
		
	}
	private static void addingMethod() {
		Set<Object> set = new HashSet<>();
		set.add("Vjay");
		set.add(12);
		set.add("Ajay");
		set.add("Mayur");
		set.add(1);
		set.add(12);
		set.add(2);
		set.add("Sagar");
		set.add("Mayur");
		set.add(null);

		for (Object object : set) {
			System.out.println("In order is " + object);
		}
	}

	private static void addingPrimeNumber() {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(11);
		set.add(13);
		set.add(17);
		for (Integer value : set) {
			System.out.println("Prime no. is " + value);
		}
	}

	private static void addingNameMethod() {
		Set<String> set = new HashSet<>();
		set.add("Mayur");
		set.add("Nilesh");
		set.add("Mayur");
		set.add("Sagar");
		for (String name : set) {
			System.out.println("Name is " + name);
		}
	}

	private static void addingAlphabetMethod() {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("F");
		set.remove("C");
		for (String value : set) {
			System.out.println("Alphabet is " + value);
		}
	}

	private static void naturalNumberMethod() {
		Set<Object> set = new HashSet<>();
		set.add(1);
		set.add("Mayur");
		set.add(3.22f);
		set.add(4.0d);
		set.add(5l);
		for (Object number : set) {
			System.out.println("Natural number is " + number);
		}
	}
}
