package com.topic.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeandFast1 {

	public static void main(String[] args) {

		failsafe();
		failFast();
	}

	private static void failFast() {
		List<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		for (Integer value : list) {
			list.add(3);
			System.out.println(value);
		}
	}

	private static void failsafe() {
		List<Object> list = new CopyOnWriteArrayList<>();
//		List<Object> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(5);

		for (Object value : list) {
			list.add(55);
			System.out.println("Object value of array list is " + value);

		}
	}

}
