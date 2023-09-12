package com.capita.abstraction;

public class StudentPrgm {
	public static void main(String[] args) {
		StudentPrgm studentPrgm = new StudentPrgm();
		studentPrgm.getName("Mayur");
//		studentPrgm.getMobileNumber();
		System.out.println("Student Address is :" + studentPrgm.getAddress("Kurha"));
		studentPrgm.getPinCode();
		System.out.println("Mobile Number is : " + studentPrgm.getMobileNumber("9975509648"));

	}

	private String getMobileNumber(String mobilenumber) {
		return mobilenumber;
	}

	protected void getPinCode() {
		System.out.println("Pin code is 444709");
	}

	protected String getMobileNumbeAr(String mobilenumber) {
		return mobilenumber;
	}

	protected String getAddress(String address) {

		return address;
	}

	protected void getName(String name) {
		System.out.println("Name is " + name);
	}

}
