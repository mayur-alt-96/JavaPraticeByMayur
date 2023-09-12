package com.mayur.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUnmodifiableExample3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
		System.out.println("Unmodifiable Collection: " + unmodifiableList);
		
		list.add(50);
		System.out.println("Unmodifiable Collection after adding element: "+list );
	
		for (Integer value : unmodifiableList) {
			System.out.println(value);
		}
	}

}
