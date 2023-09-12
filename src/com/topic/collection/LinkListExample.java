package com.topic.collection;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {

		// Object link list
		addingObjectLinkList();

		// Integer link list
		addingIntegerLinkList();
	}

	private static void addingIntegerLinkList() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.remove(4);
		for (Integer value : list) {
			System.out.println("The integer value is " + value);
			System.out.println("The integer value is " + list.clone());
		}
	}

	private static void addingObjectLinkList() {
		LinkedList<Object> List = new LinkedList<>();
		List.add("Mayur");
		List.add(25);
		List.add("Nilsh");
		List.add(29);
		List.add("Sagar");
		List.add(31);
		for (Object value : List) {
			System.out.println("The value of link list is " + value);
		}
		System.out.println("===============================");
	}
	
}
