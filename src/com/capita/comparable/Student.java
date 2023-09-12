package com.capita.comparable;

public class Student {

	int id;
	String name;
	String address;
	volatile int salary;

	Student(int id, String name, String address, int salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
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

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public  String toString() {

		return "id is :" + getId() + " name is :-" + getName() + " address is :" + getAddress() + " and salary is :"
				+ getSalary();
	}

}
