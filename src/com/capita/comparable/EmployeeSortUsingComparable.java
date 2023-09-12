package com.capita.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSortUsingComparable {

	public static void main(String[] args) {

//		callingEmployee();

//		
//		
//		sortingGenericObject();

//		List<Employee> list = Arrays.asList(new Employee(11, "Nilesh", "Pune"), new Employee(10, "Mayur", "Amravati"),
//				new Employee(12, "Nikhil", "mumbai"));

	}

	private static void callingEmployee() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(11, "Nilesh", "Pune"));
		list.add(new Employee(10, "Mayur", "Amravati"));
		list.add(new Employee(12, "Nikhil", "mumbai"));
		list.add(new Employee(13, "Ankush", "AUg"));
		list.add(new Employee(11, "amol", "AUg"));

		Collections.sort(list);
		System.out.println(list);
	}

	private static void sortingGenericObject() {
		List<Integer> list = Arrays.asList(10, 50, 05, 6, 8, 9, 12, 32, 14);
		List<String> listNew = Arrays.asList("Mayur", "Nilesh", "Ankush");

		Collections.sort(list);
		System.out.println(list);
		Collections.sort(listNew);
		System.out.println(listNew);
	}
}
