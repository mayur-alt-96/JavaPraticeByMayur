package com.mayur.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetPrgm {

	public static void main(String[] args) {

//		Set<Object> set = new CopyOnWriteArraySet<>();
//		set.add(10);
//		set.add(15);
//		set.add(14);
//		set.add(10);
//		set.add(11);
//		
//		for (Object value : set) {
//			set.add(19);
//			System.out.println("The object value is "+ value);
//			
//		}

		Set<Object> set = new CopyOnWriteArraySet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		for (Object value : set) {
			set.remove(5);
			System.out.println("The value of is " + value);
		}
	}

}
