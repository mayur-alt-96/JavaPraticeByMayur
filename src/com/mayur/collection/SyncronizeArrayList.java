package com.mayur.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncronizeArrayList {

	public static void main(String[] args) {

		fruitListMethod();
	}

	private static void fruitListMethod() {
		List<String> fruitList = new ArrayList<>();

		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Pineapple");

		fruitList = Collections.synchronizedList(fruitList);

		synchronized (fruitList) {

			for (String value : fruitList) {
				System.out.println(value);
			}
		}
	}
}
