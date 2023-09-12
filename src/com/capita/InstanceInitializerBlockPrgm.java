package com.capita;

public class InstanceInitializerBlockPrgm {

	int speed;
	static int age;
	static {
		age = 10;
		System.out.println("Age is " + 10);
	}

	public InstanceInitializerBlockPrgm() {
//		super();
		System.out.println("Bike speed is " + speed);
	}

	{
		speed = 500;
		System.out.println("This is IIB " + speed);
	}

	public String show() {
		System.out.println("Calling show method.");
		return "Calling show ";
	}

	public static void main(String[] args) {

		InstanceInitializerBlockPrgm instanceInitializerBlockPrgm = new InstanceInitializerBlockPrgm();
		instanceInitializerBlockPrgm.show();
	}
}

//  Instance initializer block
// it use to initialize some varible or do some operation before constructor execution.
//  it will execute before constructor executed.
// we can only use static varible in static method/block , we can not use non static varible in static(method/block).