package com.mayur.comparable;

import java.util.Comparator;

public class EmployeeSortBasedOnEmpSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getEmpSalary() >= 50000 && o2.getEmpSalary() >= 50000) {

			if (o1.getEmpSalary() > o2.getEmpSalary()) {
				return 1;
			} else if (o1.getEmpSalary() < o2.getEmpSalary()) {
				return -1;
			}
		}
		return 0;
	}

}
