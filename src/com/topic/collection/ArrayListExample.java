package com.topic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		// Adding Object
//		addingIntegerList();

		addingInteger();
		
	}

	private static void addingInteger() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(15);
//		Collections.sort(list);
//		list.add(3, 60);
		System.out.println(list.size());
		list.remove(4);
		for (Integer value : list) {
			System.out.println("Integer list is " + value);
		}
	}

	private static void addingIntegerList() {
		ArrayList<Object> list = new ArrayList<>();
		list.add("Mayur Chokte");
		list.add(20);
		list.add("Nilesh Chokte");
		list.add(40);
		list.add("Sagar Chokte");
		list.add(60);
		list.add("Chokte Family");
//		list.remove(3);
		for (Object value : list) {
			System.out.println("The value from list is " + value);
		}
		System.out.println("The value from list is " + list.hashCode());
	}

}
