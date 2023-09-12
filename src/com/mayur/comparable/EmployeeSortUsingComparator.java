package com.mayur.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSortUsingComparator {

	public static void main(String[] args) {

//		List<Employee> list = new ArrayList<>();
//		list.add(new Employee(10, "Mayur", 50000, "Kurha"));
//		list.add(new Employee(15, "Neha", 11000, "Agra"));
//		list.add(new Employee(11, "Nilesh", 100000, "Pune"));
//		list.add(new Employee(13, "Nilima", 90000, "Nagpur"));
//		list.add(new Employee(12, "Sagar", 55000, "Amravati"));
//		list.add(new Employee(14, "Pratibha", 60000, "Yavatmal"));

		List<Employee> list = Arrays.asList(new Employee(10, "Mayur", 50000, "Kurha"),
				new Employee(15, "Neha", 11000, "Agra"), new Employee(11, "Nilesh", 100000, "Pune"),
				new Employee(13, "Nilima", 90000, "Nagpur"), new Employee(12, "Sagar", 55000, "Amravati"),
				new Employee(14, "Pratibha", 60000, "Yavatmal"));

		Collections.sort(list, new EmployeeSortBasedOnEmpId());
		System.out.println("Employees sort based on id is " + list);

//		Collections.sort(list, new EmployeeSortBasedOnEmpName());
//		System.out.println("Employees sort based on name is " + list);

//		Collections.sort(list, new EmployeeSortBasedOnEmpSalary());
//		System.out.println("Employees sort based on salary is " + list);
	}

}