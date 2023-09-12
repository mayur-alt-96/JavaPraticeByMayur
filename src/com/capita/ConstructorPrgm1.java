	package com.capita;

public class ConstructorPrgm1 {
	int x, y, z;
	String name, address;

	private ConstructorPrgm1(int x) {
		this.x = x;
		System.out.println("Single parameterized constructor " + 10);
	}

	private ConstructorPrgm1(int x, int y) {
		this(x);
		this.x = x;
		this.y = y;
		System.out.println("Double parameterized constructor " + 10 + " and " + 20);
	}

	private ConstructorPrgm1(int x, int y, int z) {
		this(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Triple parameterized constructor " + 10 + ", " + 20 + " and " + 30);
	}

	private ConstructorPrgm1(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("Calling " + "Mayur " + "and " + "His address");
	}

	public static void main(String[] args) {
		ConstructorPrgm1 constructorPrgm1 = new ConstructorPrgm1(10, 20);
		ConstructorPrgm1 constructorPrgm = new ConstructorPrgm1("" , "");

	}

}
