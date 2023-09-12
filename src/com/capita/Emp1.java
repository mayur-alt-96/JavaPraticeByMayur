package com.capita;

public class Emp1 {
	int id;
	String name;
	String Address;

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
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

//	@Override
//	public String toString() {
//		return "Emp id is "+this.id+" and emp name is "+this.name+ " and emp address is "+this.Address;
//	}
	public static void main(String[] args) {
		Emp1 emp1 = new Emp1();
		emp1.setId(1);
		emp1.setName("Nilesh");
		emp1.setAddress("Kurha");
		System.out.println(emp1);
		
	}

	@Override
	public String toString() {
		return "Emp1 [id=" + getId() + ", name=" + getName() + ", Address=" + Address + "]";
	}
}
