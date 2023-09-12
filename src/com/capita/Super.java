package com.capita;

class Super1 {
	public Super1(int x) {
		System.out.println("Calling parent class constructor one is " + x);
	}

	public Super1(int y, int z, int x) {
		this(x);
		System.out.println("Calling parent class constructor second " + x + " , " + y + " and " + z);
	}

	public void show() {
		System.out.println("Calling show from parent class");
	}

	public void display() {
		System.out.println("Calling display from parent class");
	}

	int speed = 180;
	String name = "Bullet";
}

public class Super extends Super1 {

	public Super(int x, int y, int z) {
		super(y, z, x);
		System.out.println("Calling child class constructor " + y);
		System.out.println("Calling child class constructor second " + x + " , " + y + " and " + z);
	}

	int speed = 150;
	String name = "Yamaha";

	@Override
	public void show() {
		super.show();
		System.out.println("Calling show from child class");
	}

	@Override
	public void display() {
		System.out.println("Calling display from child class");
		super.display();
	}

	public void get() {
		System.out.println("Parent class Bike deatails");
		System.out.println(super.speed);
		System.out.println(super.name);
		System.out.println("Child class Bike details");
		System.out.println(speed);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Super super1 = new Super(10, 11, 12);
		super1.show();
		super1.display();
		super1.get();
	}
}
