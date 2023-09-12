package com.capita;

public class StaticPrgm {

	static String address = "Kurha";
	String name;
	int age;

//	static {
//		System.out.println("calling static block");
//	}

	public static void main(String[] args) {

		StaticPrgm staticPrgm = new StaticPrgm();
		staticPrgm.name = "Nilesh";
		staticPrgm.age = 30;
		System.out.println("Candidate details");

		System.out.println(staticPrgm.name);
		System.out.println(staticPrgm.age);
		System.out.println(StaticPrgm.address);
//
//		staticPrgm.name = "Mayur";
//		staticPrgm.age = 25;
//
//		System.out.println(staticPrgm.name);
//		System.out.println(staticPrgm.age);
//		System.out.println(StaticPrgm.address);s
//
//		staticPrgm.name = "Sagar";
//		staticPrgm.age = 31;
//
//		System.out.println(staticPrgm.name);
//		System.out.println(staticPrgm.age);
//		System.out.println(StaticPrgm.address);
//
	}

}

// static-- static varible, static method and static block.
// static will always allocated the memory while class loading.
// best use of static to save memory.
// static always get call through classname rather than objectname.(dot)
//1) static variable.--> like college name --> all student will have same college name
// - how to declare - static String collegeName ="YCCE".
// - all object will share common memory location.

//2) static method- when you want to access your class method from another class then you can direclty call static method using classname. it will save your memory because static method will call using class name so we no need to create the object.
// ref Nilesh.java and mayur.java
// we can not override static method- because static method loads at compile time and method overriding will always happens at run time.
//
// 3) static block - if you want to do some operation before creating an object then static block will help you out.

// ref - StaticPrgm.java
