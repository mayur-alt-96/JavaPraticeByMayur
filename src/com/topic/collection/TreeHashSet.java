package com.topic.collection;

import java.util.TreeSet;

public class TreeHashSet {
	public static void main(String[] args) {

		addingInteger();
	}

	private static void addingInteger() {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(12);
		set.add(14);
		set.add(17);
		set.add(18);
		set.add(13);
		set.add(11);
		for (Integer value : set) {
			System.out.println("The Object value is " + value);
		}

	}
}
