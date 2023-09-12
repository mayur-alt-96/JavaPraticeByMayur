package com.topic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		addingObjectInList();

		addingIntegerInList();

		addingValueInList();
		// List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90,
		// 100);
	}

	private static void addingValueInList() {
		System.out.println("Data is first String");
		List<String> list = new ArrayList<>();
		list.add("Nilesh");
		list.add("Mayur");
		list.add("Sagar");
		for (String name : list) {
			System.out.println("Name is " + name);
		}
		System.out.println();
	}

	private static void addingObjectInList() {
		System.out.println("Data is first Object");
		List<Object> list = new ArrayList<>();
		list.add("Nilesh");
		list.add(10);
		list.add(10.20f);
		list.add(255L);
		list.add(20.30d);

		for (Object value : list) {
			System.out.println("Value is " + value);
		}
		System.out.println();
	}

	private static void addingIntegerInList() {
		System.out.println("Data is first Integer");
		List<Integer> list = new LinkedList<>();
		list.add(140);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.add(130);
		list.add(180);
		list.add(180);
		Collections.sort(list);
		for (Integer value : list) {
			System.out.println("Value is " + value);
		}
		System.out.println("Total size "+list.size());
		System.out.println();
	}
}

// wrapper 
// primitive data type we converted into class.
// int - Integer
// double - Double

// Collection --> to perform operations like update / delete/ select and insert on group of data.
// why collection came into picture.
// - when we have array it use to hold similar type of data
// array has fixed size and memory waste.
// Question
// 1 ) why collection only allow wrapper class.
// ans --> because java is object oriented programming language and if you want
// to use anything
// we can only access that using object so we need a class for that, that why we
// have converted primitive data type into wrapper class.
// ans--> because wrapper class has equals and hashcode method to identify
// object.
//