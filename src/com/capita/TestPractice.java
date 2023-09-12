package com.capita;
class Parent1{
	
	public Parent1() {
		System.out.println("Parent class constructor");
	}
	public void show() {
		System.out.println("Callling parent show method");
	}
}

public class TestPractice extends Parent1 {
	public TestPractice() {
		System.out.println("Child class constructor");
	}
	public void show() {
		super.show();
		System.out.println("Callling child show method");
	}
	public static void main(String[] args) {
		
		Parent1 testPractice = new TestPractice();
		testPractice.show();
		
	}

}
