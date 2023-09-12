package com.topic.collection;

class SuperType {
	public void show() {
		System.out.println("calling show method from super");
	}
}

public class SubType extends SuperType {

	public void show() {
		super.show();
		System.out.println("calling show method from sub");
	}

	public static void main(String[] args) {

		SuperType subType = new SubType();
		subType.show();

	}
}
