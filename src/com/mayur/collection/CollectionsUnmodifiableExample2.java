package com.mayur.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUnmodifiableExample2 {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<>();

		Collections.addAll(c, "Google", "Mozila FireFox", "Yahoo");
		
		System.out.println("Initial Collection: " + c);
		
		Collection<String> c2 = Collections.unmodifiableCollection(c);
		
		c2.add("Safari");
	}
}
