package com.capita;

interface Employee {
	void show();
}

class Dev implements Employee {
	public void show() {
		System.out.println("Employee from developemet Dept");
	}
}

class QA implements Employee {
	public void show() {
		System.out.println("Employee from QA Dept");
	}
}

class Testing implements Employee {
	public void show() {
		System.out.println("Employee from Testing Dept");
	}
}

public class Company {

	Employee emp;

	public void setEmp(Employee Emp) {
		this.emp = Emp;
	}

	void taskPerform() {
		emp.show();
	}

	public static void main(String[] args) {
		Company company = new Company();

		Employee dev = new Dev();
		Employee qa = new QA();
		Employee testing = new Testing();

		company.setEmp(qa);
		company.taskPerform();
	}
}
