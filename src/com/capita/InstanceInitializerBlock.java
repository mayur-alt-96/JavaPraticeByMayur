package com.capita;

public class InstanceInitializerBlock {
	int speed;
	static int age = 26;
	static {
		System.out.println("Calling age limit is " + age);

	}

	public InstanceInitializerBlock() {
		super();
		System.out.println("Calling constructor");
	}

	{
		speed = 150;
		System.out.println("Calling block");
		System.out.println("Calling constructor speed is " + speed);
	}

	public void show() {
		System.out.println("Show method");
	}

	public static void main(String[] args) {
		InstanceInitializerBlock block = new InstanceInitializerBlock();
//		block.show();
	}
}
