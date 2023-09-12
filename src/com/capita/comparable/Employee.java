package com.capita.comparable;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {

		return "Id is :" + getId() + " name is :" + getName() + " and address is :" + getAddress();

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compareTo(Employee emp) {
		if (this.getId() > emp.getId()) {
			return 1;
		} else if (this.getId() < emp.getId()) {
			return -1;
		} else
			return 0;

//		return this.getName().compareTo(emp.getName());

	}
}
