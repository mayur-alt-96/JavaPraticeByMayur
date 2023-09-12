package com.topic.collection;

import java.util.HashSet;
import java.util.Set;

class Student {
	int id;
	String name;
	String address;

	Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

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
		return "Id is " + getId() + "Name is " + getName() + "Address is " + getAddress();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Student student = (Student) obj;
		return (student.name.equals(this.name) && student.id == this.id && student.address.equals(this.address));

	}
@Override
public int hashCode() {
	return this.id;
}
}

public class SetWithClassPrgm1 {

	public static void main(String[] args) {

		Student student1 = new Student(10, "Mayur", "Kurha");
		Student student2 = new Student(11, "Nilesh", "Pune");
		Student student3 = new Student(12, "Sagar", "Amt");
		Student student4 = new Student(10, "Mayur", "Kurha");
		Student student5 = new Student(10, "Mayur", "Amt");
		Student student6 = new Student(11, "Nilesh", "Pune");

		Set<Object> set = new HashSet<>();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		set.add(student5);
		set.add(student6);
		for (Object value : set) {
			
			System.out.println("Size is " + value);
		}

	}

}
