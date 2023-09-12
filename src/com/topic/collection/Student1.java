package com.topic.collection;

import java.util.HashSet;
import java.util.Set;

public class Student1 {
	long id;
	String name;
	String address;

	public Student1(int id , String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


	@Override
	public boolean equals(Object obj) {
//		if(this == obj)
//			return true;
		
		if(obj == null || obj.getClass() != this.getClass())
			return false;
		
		Student1 stud = (Student1) obj;
		return stud.id == this.id && stud.name.equals(this.name) && stud.address.equals(this.address);
	}
	@Override
	public int hashCode() {
		return Math.toIntExact(this.id);
	}
	public static void main(String[] args) {
		Student1 student = new Student1(1, "Mayur", "Kurha");
		Student1 student1 = new Student1(3, "Nilesh", "Pune");
		Student1 student2 = new Student1(2, "Sagar", "Amravati");
		Student1 student3 = new Student1(4, "Sagar", "Amravati1");
		Student1 student4 = new Student1(4, "Sagar", "Amravati1");

		Set<Student1> set = new HashSet<>();
		set.add(student);
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		for (Student1 value : set) {
			System.out.println(value);
		}
	}
}
