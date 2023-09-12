package com.mayur.comparable;

public class Employee {

	int empId;
	String empName;
	long empSalary;
	String empAddress;

	public Employee(int empId, String empName, long empSalary, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}
	
	
}
