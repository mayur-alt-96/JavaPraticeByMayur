package com.mayur.comparable;

import java.util.Comparator;

public class EmployeeSortBasedOnEmpId implements Comparator<Employee> {

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		if (o1.getEmpId() < o2.getEmpId()) {
//			return 1;
//		} else if (o1.getEmpId() > o2.getEmpId()) {
//			return -1;
//		}
//		return 0;
//	}

	
	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpId() > o2.getEmpId()) {
			return 1;
		} else if (o1.getEmpId() < o2.getEmpId()) {
			return -1;
		}
		return 0;
	}

}
