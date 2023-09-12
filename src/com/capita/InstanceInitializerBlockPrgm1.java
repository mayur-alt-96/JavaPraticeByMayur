package com.capita;

public class InstanceInitializerBlockPrgm1 {

	int speed;
	String name;
	static int age;
	static {
		age = 7;
		System.out.println("Bike age is " + 7);
	}

	public void show() {
		System.out.println("This is details of bikes");
	}

	public void getName() {
		System.out.println("Bike name is YAMAHA");
	}

	public InstanceInitializerBlockPrgm1() {
		super();
		System.out.println("Bike speed is " + speed);
	}

	{
		speed = 120;
		System.out.println("High performance speed of bike is " + 150);
	}

	public static void main(String[] args) {
//		InstanceInitializerBlockPrgm1 instanceInitializerBlockPrgm1 = new InstanceInitializerBlockPrgm1();
//		instanceInitializerBlockPrgm1.getName();
//		instanceInitializerBlockPrgm1.show();
	}
}
