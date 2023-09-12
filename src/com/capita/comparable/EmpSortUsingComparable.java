package com.capita.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmpSortUsingComparable {

	public static void main(String[] args) {

		CallingEmp();

		sortGenericObject();
	}

	private static void CallingEmp() {
//		List<Emp> list = new ArrayList<>();
//		list.add(new Emp(10, "Mayur", 1000, "Kurha"));
//		list.add(new Emp(11, "Nilesh", 2000, "Pune"));
//		list.add(new Emp(12, "Sagar", 3000, "Amt"));
//		list.add(new Emp(13, "Nikhil", 4000, "Amt"));
//		list.add(new Emp(10, "Mayur", 1000, "Kurha"));

		List<Emp> list = Arrays.asList(new Emp(10, "Mayur", 1000, "Kurha"), new Emp(11, "Nilesh", 2000, "Pune"),
				new Emp(12, "Sagar", 3000, "Amt"), new Emp(13, "Nikhil", 4000, "Amt"),
				new Emp(10, "Mayur", 1000, "Kurha"));
		Collections.sort(list);
		System.out.println(list);
	}

	private static void sortGenericObject() {
		List<Integer> list = Arrays.asList(1, 2, 3, 10, 56, 05, 52, 64, 25);
		List<String> newList = Arrays.asList("Mayur", "Nilesh", "Sagar");

		Collections.sort(list);
		System.out.println(list);

//Collections.sort(newList);
//System.out.println(newList);
	}

}
