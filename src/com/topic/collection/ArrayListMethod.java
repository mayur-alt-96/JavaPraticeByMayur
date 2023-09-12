package com.topic.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {

		// using add method
//		addingIntegerInList();

		// using add with index
		addingIntegerWithIndex();

		// getting data from list
//		gettingDataFromList();

		// detete data from list
		deleteDataFromList();
	}
	private static void deleteDataFromList() {
		List<Object> list = new ArrayList<>();
		list.add("Mayur Chokte");
		list.add(20);
		list.add("Nilesh Chokte");
		list.add(40);
		list.add("Sagar Chokte");
		list.remove(2);
		for (Object value : list) {
			System.out.println("Value from list is " + value);
		}
		System.out.println();
	}

	private static void gettingDataFromList() {
		List<Object> list = new ArrayList<>();
		list.add("Mayur");
		list.add(20);
		list.add("Nilesh");
		list.add(40);
		list.add("Sagar");
		System.out.println("Getting value of given index "+list.get(3));
		
		System.out.println();
	}

	private static void addingIntegerWithIndex() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(1, 60);
		for (Integer value : list) {
			System.out.println("Adding value with index is " + value);
		}
		System.out.println();
	}

	private static void addingIntegerInList() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		for (Integer num : list) {
			System.out.println("Adding value is " + num);
		}
		System.out.println();
	}
}
