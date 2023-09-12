package com.oopsConcept.Inheritance;

public class MethodConceptPrgm {

	public static void main(String[] args) {

		MethodConceptPrgm methodConceptPrgm = new MethodConceptPrgm();
		methodConceptPrgm.getName();
//		String address = methodConceptPrgm.getAddress();
//		System.out.println(address);
		System.out.println(methodConceptPrgm.getAddress());

		System.out.println("Student age is " + methodConceptPrgm.getAge());
		System.out.println("Student salary is " + methodConceptPrgm.getSalary());

	}

	public void getName() {
		System.out.println("calling getname method.");
	}

	public String getAddress() {
//		String address = "At post kurha ta-tiosa dist-amravati";
//		return address;

		return "At post kurha ta-tiosa dist-amravati";

	}

	public int getAge() {
		int age = 22;
		return age;
	}

	public long getSalary() {
		long salary = 100000;
		return salary;
	}

	// public - scope or access specifier private default and protected
	// void - return type and it will be any datatype.
	// getName - is a method name.
	// when we define return type as a datatype then it will return some values
	// based on datatype.
}
