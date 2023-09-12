package com.capita.comparable;

import java.util.Comparator;

public class StudentSortBySalary implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else if (o1.getSalary() < o2.getSalary()) {
			return -1;
		}
		return 0;
	}

}
