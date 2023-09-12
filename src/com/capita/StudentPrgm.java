package com.capita;

public class StudentPrgm {
	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
//	static void change() {
//		college = "YCCE.";
//	}

	static void change() {
		college = "GHRCEM";
	}

	// constructor to initialize the variable
	StudentPrgm(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void show() {
		System.out.println("Printing student related details");
	}

	public static void main(String[] args) {

		show();
		StudentPrgm.change();// calling change method
		// creating objects
		StudentPrgm s1 = new StudentPrgm(111, "Karan");
		StudentPrgm s2 = new StudentPrgm(222, "Aryan");
		StudentPrgm s3 = new StudentPrgm(333, "Sonoo");
		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}
}
