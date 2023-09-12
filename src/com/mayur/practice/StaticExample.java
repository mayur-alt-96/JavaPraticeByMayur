package com.mayur.practice;

class Parent{
	
	public void show() {
		System.out.println("This is show method from parent class");
	}
	public Parent() {
		System.out.println("This constructor from parent class");
	}
}

public class StaticExample extends Parent {
	
	public void show() {
		super.show();
		System.out.println("This is show method from child class");
	}
	public StaticExample() {
		System.out.println("This constructor from child class");
	}
	public static void main(String[] args) {
	
		Parent staticExample = new StaticExample();
		staticExample.show();
	}

}
