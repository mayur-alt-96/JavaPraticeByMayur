package com.mayur.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsUnmodifiableExample1 {

	public static void main(String[] args) {

//		Collection<String> c = new ArrayList<>();
//
//		Collections.addAll(c, "Google", "Mozila FireFox", "Yahoo");
//		Collection<String> c2 = Collections.unmodifiableCollection(c);
//		System.out.println("Unmodifiable Collection: " + c2);
//		c.add("Safari");
//		System.out.println("Unmodifiable Collection after adding element to the original one:");
//		System.out.println(c2);
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
//		List<Integer> list2 = Collections.unmodifiableList(list);
		List<Integer> list3 = Collections.synchronizedList(list);
//		list2.add(6);
		list3.add(7);
		list.add(8);
		System.out.println(list);
		

	
	List<Integer> list1 =Arrays.asList(1,2,3,3,4,5,6,7,8,9,11,12);
	Collections.unmodifiableCollection(list1);
	list1.add(13);
	System.out.println(list1);
	}
}
