package com.capita;

class Family {
	int speed = 150;
	String name = "Bullet";

	public Family() {
		System.out.println("Default Constructor");
	}

	public Family(int x) {
		this();
		System.out.println("Single parameterized Constructor " + x);
	}

	public Family(int x, int y) {
		this(x);
		System.out.println("Double parameterized Constructor " + x + " and " + y);
	}

	public void display() {
		System.out.println("Family Details");
	}

	static {
		System.out.println("The head of Family");
	}
	{
		System.out.println("Parent class IIB");
	}
}

public class SuperPrgm1 extends Family {
	int speed = 120;
	String name = "YAMAHA";
	{
		System.out.println("child class IIB");
	}
	static{
		System.out.println("child class static");
	}

	public SuperPrgm1() {
		super();
		System.out.println("High speed is " + speed);
	}

//	public SuperPrgm1(int x) {
//		super(x);
//		System.out.println("Single Child class Constructor");
//	}

	public SuperPrgm1(int x, int y) {
		super(x, y);
		System.out.println("Double Child class Constructor");
	}

	public void display() {
		super.display();
		System.out.println("Child Family Details");
	}
	{
		speed = 180;
		System.out.println("High speed");
	}
	
	public void show() {
		System.out.println("Parent Class Details");
		System.out.println(super.name);
		System.out.println(super.speed);
		System.out.println("Child Class Details");
		System.out.println(name);
		System.out.println(speed);
	}

	public static void main(String[] args) {
		SuperPrgm1 object = new SuperPrgm1(10, 12);
		object.display();
		object.show();
		
	}


}
