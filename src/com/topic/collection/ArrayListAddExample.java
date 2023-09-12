package com.topic.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddExample {
	public static void main(String[] args) {
//		List<Object> list = new ArrayList<>();
//		list.add("element1");
//		list.add(Boolean.TRUE);
//		list.add("last element");
//		System.out.println("Given value "+list.get(1));
//		System.out.println(list);

//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add("Student id");

//		List<String> colors = new ArrayList<>();
//		colors.add("red");
//		colors.add("blue");
//		colors.add(1,"white");
//		colors.add(0,"black");
//		System.out.println(colors);

//		List<Object> list = new ArrayList<>();
//		list.add(0,"element1");
//		list.add(1,"element2");
//		list.add(3,"element3");
//		

		List<Object> list = new ArrayList<>();
		list.add(0, "e1");
		list.add(1);
		list.add(1, "e2");
		list.add(0, 1);
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
