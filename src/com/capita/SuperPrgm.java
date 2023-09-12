package com.capita;

class Parent {

	public Parent() {
		System.out.println("Calling default constructor");
	}

	public Parent(int x) {
		this();
		System.out.println("Calling single parameter constructor parent class " + x);
	}

	public Parent(int x, int y) {
		this(x);
		System.out.println("Calling double parameter constructor parent class " + x + " and " + y);
	}

	int speed = 10;
	String name = "Bullet";

	public void display() {
		System.out.println("calling parent class display method.");
	}
}

public class SuperPrgm extends Parent {

	public static void main(String[] args) {
		
		SuperPrgm parent = new SuperPrgm(10,11);
		parent.show();
		parent.display();
		
		// if we dont have super keyword then we will face below issue. we need to
		// create seperate seperate object for all the classes to acces the all
		// variables.
//		System.out.println("child class details");
//		System.out.println(parent.speed);
//		System.out.println(parent.name);
//
//		System.out.println("Parent class details");
//		Parent p = new Parent();
//		System.out.println(p.speed);
//		System.out.println(p.name);
		
	}
	
	public SuperPrgm(int x) {
		super(10,20);
		System.out.println("calling child class default constructor");
	}

	public SuperPrgm(int x, int y) {
		super(x, y);
		System.out.println("single parameter con- child");
	}

	int speed = 20;
	String name = "KTM";


	public void show() {

		System.out.println("Parent class bike details");
		System.out.println(super.speed);
		System.out.println(super.name);
		System.out.println("Child class bike details");
		System.out.println(speed);
		System.out.println(name);

	}

	public void display() {
		super.display();
		System.out.println("calling child class disply method.");
	}
}

// super keyword - it use to call parent class varible into child class.if parent class and child class contain same varibles.
// - when super class method and child class method is same then we can call
// super classs method from child class using super keyword.ex super.display()
// when child class constructor get call before that parent class constructor will get call.

// If we are creating child class object using parent class reference and calling any method then that method at least should be there in parent otherwise it will give you compile time error.
