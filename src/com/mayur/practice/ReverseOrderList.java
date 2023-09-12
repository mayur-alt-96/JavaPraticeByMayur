package com.mayur.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseOrderList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("The value is " + list);
		Collections.reverse(list);
		System.out.println("The value is " + list);

//		Iterator<Integer> iterator = list.listIterator(list.size());
//		for (int i = list.size() - 1; i >= 0; i--) {
//			System.out.println("The value is " + list.get(i));
//		}
//
//		System.out.println("====================");
//		for (Integer value : list) {
//			System.out.println("The value is " + value);
//		}
		
		
	}
}
