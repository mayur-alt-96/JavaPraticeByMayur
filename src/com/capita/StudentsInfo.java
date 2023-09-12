package com.capita;

public class StudentsInfo {
	int id;
	String name;
	String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student Id is " + this.id + " and student name is " + this.name + " and student address is "
				+ this.address;
	}

	public void getDetails() {
		System.out.println("Students Details");
	}

	public static void main(String[] args) {
		Records records = new Records();
		StudentsInfo StudentsInfo = new StudentsInfo();
		StudentsInfo.setId(07);
		StudentsInfo.setName("Mayur Chokte");
		StudentsInfo.setAddress("Pune");
		StudentsInfo.getDetails();
		records.printRecord(StudentsInfo);
//		System.out.println(StudentsInfo);

		System.out.println("===========================================================");
		StudentsInfo studentsInfo2 = new StudentsInfo();
		studentsInfo2.setId(8);
		studentsInfo2.setName("Nilesh");
		studentsInfo2.setAddress("Mumbai");
		records.printRecord(studentsInfo2);

	}
}

class Records {
	public void printRecord(StudentsInfo studentsInfo) {
		if (studentsInfo != null) {
			System.out.println("Student Id is " + studentsInfo.getId() + " and student name is "
					+ studentsInfo.getName() + " and student address is " + studentsInfo.getAddress());

//			callingStudentId(studentsInfo);
		}
	}

	private void callingStudentId(StudentsInfo studentsInfo) {
		if ("Mumbai".equalsIgnoreCase(studentsInfo.getAddress())) {
			System.out.println("Student from Mumbai");
		} else if ("Pune".equalsIgnoreCase(studentsInfo.getAddress())) {
			System.out.println("Student from Pune");
		}
	}
}