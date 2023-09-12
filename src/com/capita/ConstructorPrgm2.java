package com.capita;

public class ConstructorPrgm2 {
	int x;
	int y;
	int z;
	String call;

	private ConstructorPrgm2(int x) {
		this.x = x;
		System.out.println("Calling first constructor is " + x);
	}

	private ConstructorPrgm2(int x, int y) {
		this(x);
		this.x = x;
		this.y = y;
		System.out.println("Calling second constructor is " + x + " and " + y);
	}

	private ConstructorPrgm2(int x, int y, int z) {
		this(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Calling third constructor is " + x + " , " + y + " and " + z);
	}

	private ConstructorPrgm2(int x, int y, int z, String call) {
		this(x, y, z);
		this.x = x;
		this.y = y;
		this.z = z;
		this.call = call;
		System.out.println("Calling fourth constructor is " + x + " , " + y + " , " + z + " and " + call);

	}

	public void show() {
		display();
		this.x = x;
		this.y = y;
		this.z = z;
		this.call = call;
		System.out.println("Calling show method");
	}

	public void display() {
		System.out.println("Calling display method");
	}

	public static void main(String[] args) {
//		ConstructorPrgm2 constructorPrgm2 = new ConstructorPrgm2(1, 0, 3, "Nilesh");
		ConstructorPrgm2 constructorPrgm2 = new ConstructorPrgm2(10);
		constructorPrgm2.show();

	}

}
