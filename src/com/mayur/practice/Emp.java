package com.mayur.practice;

class Student {

}

public class Emp extends Student {

	public static void main(String[] args) {

		Emp emp = new Emp();
		Student student = new Student();

		if (student instanceof Emp) {
			System.out.println("This is emp class");
		} else {
			System.out.println("This is emp not class");
		}
	}
}
