package com.topic.collection;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int id;
	String name;
	String address;

	Employee(int id, String name, String address) {
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Employee emp = (Employee) obj;

		return (emp.name.equals(this.name) && emp.id == this.id && emp.address.equals(this.address));
	}

	@Override
	public int hashCode() {
		return this.id;
	}
}

public class MapWithClassPrgm {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Nilesh", "Amt");
		Employee emp2 = new Employee(10, "Nilesh", "Amt");
		Employee emp3 = new Employee(11, "Mayur", "Pune");
		Employee emp4 = new Employee(12, "Chokte", "Mumabai");

		// Below code is for to iterate map when customize class as value

		Map<Integer, Employee> map = new HashMap<>();

		map.put(1, emp1);
		map.put(2, emp2);
		map.put(3, emp2);
		map.put(4, emp2);

		for (Map.Entry<Integer, Employee> empData : map.entrySet()) {

			System.out.println("Key is " + empData.getKey() + " and values is( " + empData.getValue() + " )");
		}

//		Map<Employee, Integer> map = new HashMap<>();
//		map.put(emp1, 1);
//		map.put(emp2, 2);
//		map.put(emp3, 3);
//		map.put(emp4, 3);
//		System.out.println(map.size());
	}
}

// we can add custom class as value in hashMap and look into above code to understand more.