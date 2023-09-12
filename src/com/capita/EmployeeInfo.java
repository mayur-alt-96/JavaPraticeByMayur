package com.capita;

class Record {

	public void printRecord(EmployeeInfo employeeInfo) {
		System.out.println("Emp name is " + employeeInfo.getEmpName() + " and empId is " + employeeInfo.getEmpId()
				+ " and emp salary is " + employeeInfo.getEmpSalary() + " and dept name is "
				+ employeeInfo.getDeptName() + "and address is " + employeeInfo.getAddress());

		checkDeptNameForBonus(employeeInfo);

		checkEmpIdForVehicle(employeeInfo);

		checkSalaryForDesignation(employeeInfo);

		checkEmpAddressgetaddress(employeeInfo);


	}

	private void checkDeptNameForBonus(EmployeeInfo employeeInfo) {
		if ("DEV".equalsIgnoreCase(employeeInfo.getDeptName())) {
			System.out.println("Emp name is " + employeeInfo.getEmpName() + " will get 50k bonus");
		} else if ("QA".equalsIgnoreCase(employeeInfo.getDeptName())) {
			System.out.println("Emp name is " + employeeInfo.getEmpName() + " will get 20k bonus");
		}
	}

	private void checkEmpIdForVehicle(EmployeeInfo employeeInfo) {
		if (10 == employeeInfo.getEmpId()) {
			System.out.println("Emplopyee will get AC Cab");
		} else if (11 == employeeInfo.getEmpId()) {
			System.out.println("Emplopyee will get Bike");
		}
	}

	private void checkEmpAddressgetaddress(EmployeeInfo employeeInfo) {
		if ("Kurha".equalsIgnoreCase(employeeInfo.getAddress())) {
			System.out.println("Emplopyee will get address is kurha");
		} else if ("Amravati".equalsIgnoreCase(employeeInfo.getAddress())) {
			System.out.println("Emplopyee will get address is Amravati");
		}
	}

	private void checkSalaryForDesignation(EmployeeInfo employeeInfo) {
		if (employeeInfo.getEmpSalary() >= 5000 && employeeInfo.getEmpSalary() <= 15000) {
			System.out.println("Emplopyee designation is junior Engg");
		} else if (employeeInfo.getEmpSalary() >= 15000 && employeeInfo.getEmpSalary() <= 25000) {
			System.out.println("Emplopyee designation is Senior Engg");
		}
	}
}

public class EmployeeInfo {

	String empName;
	int empId;
	long empSalary;
	String deptName;
	String address;

//
//	public EmployeeInfo(String empName, int empId, long empSalary, String deptName) {
//		this.empName = empName;
//		this.empId = empId;
//		this.empSalary = empSalary;
//		this.deptName = deptName;
//	}

//	public void displayDetails() {
//		System.out.println("This is employee details=======================");
//		System.out.println("Emp name is " + this.empName + " and empId is " + this.empId + " and emp salary is "
//				+ this.empSalary + " and dept name is " + this.deptName);
//	}
//
	@Override
	public String toString() {

//		System.out.println( "Emp name is " + getEmpName() + " and empId is " + this.empId + " and emp salary is " + this.empSalary
//				+ " and dept name is " + this.deptName);
		return "Emp name is " + getEmpName() + " and empId is " + this.empId + " and emp salary is " + this.empSalary
				+ " and dept name is " + this.deptName + "and address is " + this.address;
	}
	
	public static void main(String[] args) {
		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setEmpName("Mayur");
		employeeInfo.setEmpId(10);
		employeeInfo.setEmpSalary(10000L);
		employeeInfo.setDeptName("Dev");
		employeeInfo.setAddress("Kurha");

		Record record = new Record();
		record.printRecord(employeeInfo);
		System.out.println("=====================================================================");
		EmployeeInfo employeeInfo1 = new EmployeeInfo();
		employeeInfo1.setEmpName("Nikhil");
		employeeInfo1.setEmpId(11);
		employeeInfo1.setEmpSalary(20000L);
		employeeInfo1.setDeptName("QA");
		employeeInfo1.setAddress("Amravati");
		record.printRecord(employeeInfo1);

//		System.out.println(employeeInfo);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

// getter and setter use against constructor. if you are not setting any value to setter than while getting it will get default value(like string is null and int is 0).
// toString method use.
// Every class superclass in object class.
// beans are use to send complete object from one class to another class using method . it use setter and getter to set and retrieve data.
