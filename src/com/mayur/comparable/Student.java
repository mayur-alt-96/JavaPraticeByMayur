package com.mayur.comparable;

public class Student implements Comparable<Student> {

	int id;
	String name;
	String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getAddress() {
		return address;
	}

//	public void setAddress(String address) {
//		this.address = address;
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Student student) {
		return this.address.compareTo(student.address);
	}

//	@Override
//	public int compareTo(Student student) {
//		
//		return this.name.compareTo(student.getName());
//	}

//	@Override
//	public int compareTo(Student student) {
//		if (this.getId() > student.getId()) {
//			return 1;
//		} else if (this.getId() < student.getId()) {
//			return -1;
//		}
//		return 0;
//	}
}
