package com.capita;

public class ConstructorPrgm {
	int x, y, z;
	int a, b;

//	public ConstructorPrgm() {
//	System.out.println("default constructor");
//		// TODO Auto-generated constructor stub
//	}

	public ConstructorPrgm(int x, int y) {
		this(10);
		this.x = x;
		this.y = y;
		System.out.println("calling double parameterized constructor." + x + " and " + y);
	}

	public ConstructorPrgm(int x) {
		this.x = x;
		System.out.println("single parameterized constructor");
	}

	public ConstructorPrgm(int x, int y, int z) {
		this(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Calling three parameterized constructor " + x + " and " + y + " and " + z);
	}

//	public void ConstructorPrgm1(int a, int b) {
//		this.a = a;
//		this.b = b;
//		System.out.println("calling constructor." + a + " and " + b);
//
//	}

	public static void main(String[] args) {

//		ConstructorPrgm constructorPrgm = new ConstructorPrgm(20, 30);
//		constructorPrgm.ConstructorPrgm1(10, 20);
		ConstructorPrgm constructorPrgm2 = new ConstructorPrgm(50, 60);
//		ConstructorPrgm constructorPrgm3 = new ConstructorPrgm(40);

		// constructorPrgm.ConstructorPrgm1(30, 40);
	}
}

// constructor is same as class name
// it does not have any return type.
// it will be parameterized.
// when we don't write any constructor in a class then compiler will add default constructor.
// when constructor will call- when we create object
// use if we want to initialize variable or do some work while creating an a object.
//Every time an object is created using the new() keyword, at least one constructor is called.
// 	

//public class ConstructorPrgm {
//	int x, y;
//	int a, b;
//
//	public ConstructorPrgm(int x, int y) {
//		this.x = x;
//		this.y = y;
//		System.out.println("calling constructor." + x + " and " + y);
//	}
//
//	public void ConstructorPrgm1(int a, int b) {
//		this.a = a;
//		this.b = b;
//		System.out.println("calling constructor." + a + " and " + b);
//	}
//
//	public static void main(String[] args) {
//		ConstructorPrgm constructorPrgm = new ConstructorPrgm(20, 30);
//		constructorPrgm.ConstructorPrgm1(50, 60);
//	}
//}

////Java Program to create and call a default constructor  
//class Bike1 {
////creating a default constructor  
//	Bike1() {
//		System.out.println("Bike is created");
//	}
//
////main method  
//	public static void main(String args[]) {
////calling a default constructor  
//		Bike1 bike = new Bike1();
//	}
//}

////Let us see another example of default constructor  
////which displays the default values  
//class Student3 {
//	int id;
//	String name;
//
////method to display the value of id and name  
//	void display() {
//		System.out.println(id + " " + name);
//	}
//
//	public static void main(String args[]) {
////creating objects  
//		Student3 s1 = new Student3();
//		Student3 s2 = new Student3();
////displaying values of the object  
//		s1.display();
//		s2.display();
//	}
//}

////Java Program to demonstrate the use of the parameterized constructor.  
//class Student4 {
//	int id;
//	String name;
//
//	// creating a parameterized constructor
//	Student4(int i, String n) {
//		id = i;
//		name = n;
//	}
//
//	// method to display the values
//	void display() {
//		System.out.println(id + " " + name);
//	}
//
//	public static void main(String args[]) {
//		// creating objects and passing values
//		Student4 s1 = new Student4(111, "Karan");
//		Student4 s2 = new Student4(222, "Aryan");
//		// calling method to display the values of object
//		s1.display();
//		s2.display();
//	}
//}
