package com.mayur.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionsUnmodifiableExample4 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		Set<Integer> set2 = Collections.unmodifiableSet(set);
		set2.add(5);
		System.out.println(set2);
		
		for (Integer value : set2) {
			System.out.println(value);
		}
		
	}
}
