package com.capita.abstraction;

public class EmployeeImpl {

	public static void main(String[] args) {

		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.getId();

		employeeImpl.getMobileNumber();
		
		employeeImpl.getName("Test "+ "pincode" +444709);

//		System.out.println("Employee adddress is : " + employeeImpl.getAddress("Kurha"));

		employeeImpl.getPincode();
		
		

	}

	private void getId() {
		System.out.println("Employee Id. no. is DNM110");
	}

	private void getMobileNumber() {
		System.out.println("Employee mob. no. is 9975509648");
		
	}

	private void getPincode() {
		System.out.println("Employee pincode is 444709");
	}

	private String getAddress(String address) {

		return address;

	}

	private void getName(String name) {
		System.out.println("Name is " + name);

	}

//	private void getName(String name) {
//		System.out.println("Name is " + name);
//
//	}
}
