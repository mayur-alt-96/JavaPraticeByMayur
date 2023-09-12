package com.capita;

class Emp {
	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "YCCE.";
	}

	// constructor to initialize the variable
	Emp(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStaticMethodPrgm {
	public static void main(String args[]) {
//		Emp1.change();// calling change method
//		// creating objects
//		Emp1 s1 = new Emp1(111, "Karan");
//		Emp1 s2 = new Emp1(222, "Aryan");
//		Emp1 s3 = new Emp1(333, "Sonoo");
//		// calling display method
//		s1.display();
//		s2.display();
//		s3.display();
	}
}
