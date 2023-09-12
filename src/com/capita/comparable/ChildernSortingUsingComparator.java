package com.capita.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChildernSortingUsingComparator {

	public static void main(String[] args) {

		List<Childern> list = Arrays.asList(new Childern(10, "Mayur", "Mumbai"), new Childern(1, "Nilesh", "Pune"),
				new Childern(12, "Sagar", "Amravati"));

//		System.out.println("Childern data sorting based on Name");
//		Collections.sort(list, new ChildernSortBasedOnName());
//		System.out.println(list);
//
//		System.out.println("Childern data sorting based on Address");
//		Collections.sort(list, new ChildernSortBasedOnAddress());
//		System.out.println(list);

		System.out.println("Childern data sorting based on Id");
		Collections.sort(list, new ChildernSortBasedOnId());
		System.out.println(list);
	}

}
