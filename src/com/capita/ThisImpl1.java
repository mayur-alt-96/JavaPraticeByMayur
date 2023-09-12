package com.capita;

public class ThisImpl1 {
	int x, y, z;
	String name, address;
	int age;

	private ThisImpl1(int length) {
		System.out.println("Default length is " + length);
	}

	private ThisImpl1(int length, int weight) {
		this(length);
		System.out.println("Default length is " + length + " and  weight is " + weight);
	}

	private ThisImpl1(int length, int weight, long number) {
		this(length, weight);
		System.out.println("Default length is " + length + " , weight is " + weight + " and number is " + 9975509648l);
	}

	 ThisImpl1() {
		 System.out.println("Defalut constructor");
	 }
	private void getDisplay(int x, int y, int z) {
		this.x = x;
//		this.y = y;
//		this.z = z;
		System.out.println("Three parameters is " + this.x + ", " + this.y + " and " + this.z);
		getShow("", "", 25);
	}

	private void getShow(String name, String address, int age) {
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("Get Details is " + "Mayur " + 25 + " Kurha");
	}

	public static void main(String[] args) {
		ThisImpl1 thisImpl1 = new ThisImpl1(200, 78, 9975509648l);
		thisImpl1.getDisplay(10, 20, 30);
		new ThisImpl();
	}
}