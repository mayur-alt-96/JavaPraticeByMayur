package com.topic.collection;

import java.util.HashSet;
import java.util.Set;

class Employee1 {
	int id;
	String name;
	String address;

	Employee1(int id, String name, String address) {
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
		return "Id is " + getId() + " name is " + getName() + " and address is " + getAddress();
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Employee1 emp = (Employee1) obj;

		return (emp.name.equals(this.name) && emp.id == this.id && emp.address.equals(this.address));
	}
}

public class SetWithClassPrgm {

	public static void main(String[] args) {

		Employee1 emp1 = new Employee1(10, "Nilesh", "Amt");
		Employee1 emp2 = new Employee1(10, "Nilesh", "Pune");
		Employee1 emp3 = new Employee1(10, "Nilesh", "Amt");
		Employee1 emp4 = new Employee1(11, "Mayur", "Pune");
		
		System.out.println(emp1);

		Set<Employee1> set = new HashSet<>();

		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		for (Employee1 value : set) {
			System.out.println("Size is " + value);
		}
		System.out.println("Size is " + set.size());
	}
}

// we can add custom class in set but we need to override equals and hashcode so that it help you to find duplicate.