package com.capita;

class Record1 {
	public void printRecord1(StudentInfo studentInfo) {
//		if (studentInfo != null) {
		try {
			System.out.println(
					"Student name is " + studentInfo.getStName() + " and Student Id is " + studentInfo.getStId()
							+ " and Student marks is " + studentInfo.getStMarks() + " and Student dept name is "
							+ studentInfo.getDeptName() + " and Student address is " + studentInfo.getStAddress());

			checkstMarksForAward(studentInfo);
			checkstIdForvehicle(studentInfo);
			checkstAddressgetAddress(studentInfo);
		}catch (NullPointerException e) {
			System.out.println(e);
		}
	}

	private void checkstAddressgetAddress(StudentInfo studentInfo) {
		if ("Kurha".equalsIgnoreCase(studentInfo.getStAddress())) {
			System.out.println("Student from Mumbai");
		} else if ("Amravati".equalsIgnoreCase(studentInfo.getStAddress())) {
			System.out.println("Student from Pune");
		}
	}

	private void checkstIdForvehicle(StudentInfo studentInfo) {
		if (25 == studentInfo.getStId()) {
			System.out.println("Student will get Local Train");
		} else if (26 == studentInfo.getStId()) {
			System.out.println("Student will get Royal Enfield");
		}
	}

	private void checkstMarksForAward(StudentInfo studentInfo) {
		if (500 == studentInfo.getStMarks()) {
			System.out.println("Student will get Second Prize");
		} else if (600 == studentInfo.getStMarks()) {
			System.out.println("Student will get First Prize");
		}
	}
}

public class StudentInfo {
	String stName;
	int stId;
	int stMarks;
	String deptName;
	String stAddress;

	@Override
	public String toString() {
		return " Student name is " + this.stName + "and Student Id is " + this.stId + " and Student Marks is "
				+ this.stMarks + " and Student dept name is " + this.deptName + " and Student address is "
				+ this.stAddress;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public int getStMarks() {
		return stMarks;
	}

	public void setStMarks(int stMarks) {
		this.stMarks = stMarks;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getStAddress() {
		return stAddress;
	}

	public void setStAddress(String stAddress) {
		this.stAddress = stAddress;
	}

	public static void main(String[] args) {
		Record1 record1 = new Record1();
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setStName("Mayur");
		studentInfo.setStId(25);
		studentInfo.setStMarks(500);
		studentInfo.setDeptName("Mech");
		studentInfo.setStAddress("Kurha");
		StudentInfo studentInfo3 = null;
		record1.printRecord1(studentInfo3);
		System.out.println(studentInfo);

		System.out.println("===================================================================================");
		StudentInfo studentInfo2 = new StudentInfo();
		studentInfo2.setStName("Nilesh");
		studentInfo2.setStId(26);
		studentInfo2.setStMarks(600);
		studentInfo2.setDeptName("IT");
		studentInfo2.setStAddress("Amravati");
		studentInfo2.getDetailsName();
		record1.printRecord1(studentInfo2);

	}

	private void getDetailsName() {
		System.out.println("calling get details name");
	}

}