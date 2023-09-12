package com.capita;

class EmployeeDetails {

}

class StudentDetails {

}

public class InstanceOfPrgm {

	public static void main(String[] args) {

		StudentDetails studentDetails = new StudentDetails();

		if (studentDetails instanceof StudentDetails) {
			System.out.println("Yes this is Students object");
		}
	}
}
