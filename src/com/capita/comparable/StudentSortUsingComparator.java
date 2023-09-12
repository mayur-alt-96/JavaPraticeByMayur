package com.capita.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentSortUsingComparator {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student(10, "Nilesh", "Pune", 1000),
				new Student(11, "Mayur", "Amt", 2000), new Student(12, "Nikhil", "Mumbai", 500),
				new Student(9, "Nitin", "Aug", 1500));

		System.out.println("Student data sorting based on Id");
		Collections.sort(list, new StudentSortById());
		System.out.println(list);
		System.out.println( );

		System.out.println("Student data sorting based on name");
		Collections.sort(list, new StudentSortBasedOnName());
		System.out.println(list);
		System.out.println( );
		
//		System.out.println("Student data sorting based on Address");
//		Collections.sort(list, new StudentSortByAddress());
//		System.out.println(list);
//
		System.out.println("Student data sorting based on Salary");
		Collections.sort(list, new StudentSortBySalary());
		System.out.println(list);

	}
}
