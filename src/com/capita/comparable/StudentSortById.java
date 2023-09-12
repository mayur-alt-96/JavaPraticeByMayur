package com.capita.comparable;

import java.util.Comparator;

public class StudentSortById implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		if (std1.getId() > std2.getId()) {
			return 1;

		} else if (std1.getId() < std2.getId()) {
			return -1;
		}
		return 0;
	}

}
