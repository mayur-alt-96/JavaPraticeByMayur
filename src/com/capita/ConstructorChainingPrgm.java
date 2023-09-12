package com.capita;

class Super3 {

	public Super3() {
		System.out.println("parent default cons");
	}

	public Super3(int x) {
		System.out.println("parent single cons " + x);
	}

	public Super3(long y, int x) {
		this(x);
		System.out.println("parent single123 cons " + y + " and " + x);

	}

//	public void show() {
//		System.out.println("Parent calling show method");
//	}

//	public Super3() {
//		System.out.println("Calling parent class con");
//	}
}

public class ConstructorChainingPrgm extends Super3 {

	public ConstructorChainingPrgm(int x) {
		System.out.println("Calling child class con" + x);
		// TODO Auto-generated constructor stub
	}

	public ConstructorChainingPrgm() {
		System.out.println("Calling child class con");
		// TODO Auto-generated constructor stub
	}

	public ConstructorChainingPrgm(long y, int x) {
		super(y, x);
		System.out.println("Child single123 cons " + y + " and " + x);
		// TODO Auto-generated constructor stub
	}

//	public void show() {
//		super.show();
//		System.out.println("Child calling show method");
//	}

//	public ConstructorChainingPrgm() {
//		System.out.println("Child default cons");
//	}

	public static void main(String[] args) {
//		ConstructorChainingPrgm prgm = new ConstructorChainingPrgm();
//		ConstructorChainingPrgm object = new ConstructorChainingPrgm(10);
		ConstructorChainingPrgm object1 = new ConstructorChainingPrgm(10, 20);
//		object1.show();
//		prgm.show();

	}
}

// if parent class have parameterized constructor then child class must and should have parameterized constructor. we can call parent class constructor from child class constructor using super();
// when we do inheritance then child class default constructor first will be super();
// we can not use super() and this() together.

// ref - ConstructorChainingPrgm.java