package com.mayur.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import com.sun.corba.se.impl.protocol.FullServantCacheLocalCRDImpl;

public class SyncronizeHashSet {

	public static void main(String[] args) {
		
		fruitSetMethod();
	}

	private static void fruitSetMethod() {
		Set<String> fruitSet = new HashSet<>();
		
		fruitSet.add("Mango");
		fruitSet.add("Banana");
		fruitSet.add("Apple");
		fruitSet.add("Strawberry");
		fruitSet.add("Pineapple");

		fruitSet = Collections.synchronizedSet(fruitSet);
		
		for(String value : fruitSet) {
			System.out.println(value);
		}
	}
}