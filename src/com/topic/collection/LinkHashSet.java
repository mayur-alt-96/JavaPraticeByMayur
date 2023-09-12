package com.topic.collection;

import java.util.LinkedHashSet;

import sun.util.locale.provider.AvailableLanguageTags;

public class LinkHashSet {

	public static void main(String[] args) {

		addingInteger();
		addingObject();
	}

	private static void addingObject() {
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		set.add(10);
		set.add("Sagar");
		set.add(14);
		set.add("Chokte");
		set.add("Nilesh");
		set.add(13);
		set.add("Mayur");
		for (Object value : set) {
			System.out.println("The Object value is " + value);
		}
	}

	private static void addingInteger() {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
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
		System.out.println("==========================================");
	}
}
