package com.capita.comparable;

public class Emp implements Comparable<Emp> {

	int id;
	String name;
	int salary;
	String address;;

	public Emp(int id, String name, int salary, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp id is " + getId() + " name is " + getName() + " salary is " + getSalary() + " address is "
				+ getAddress();
	}

	@Override
	public int compareTo(Emp emp) {
		if(this.getId()>emp.getId()) {
			return 1;
		}else if (this.getId()<emp.getId()) {
			return -1;
		}else 
		return 0;
	}
}
