package com.mayur.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortUsingComparabe {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
	list.add(new Student(1, "Mayur", "Kurha"));
	list.add(new Student(2, "Nilesh", "Pune"));
	list.add(new Student(3, "Sagar", "Amravati"));
	list.add(new Student(1, "Mayur", "Kurha"));
	Collections.sort(list);
	System.out.println("Sort the data based on Id "+list);
	}
}
