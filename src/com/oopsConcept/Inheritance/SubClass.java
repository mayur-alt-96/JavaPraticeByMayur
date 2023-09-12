package com.oopsConcept.Inheritance;

class SuperClass1 {

	public void show() {
		System.out.println("calling show parent method.");
	}

	public void display() {
		System.out.println("Calling display parent method.");
	}

	public void checkBalance() {
		System.out.println("Calling display parent method.");
	}

	public void getBalance() {
		System.out.println("Calling display parent method.");
	}
}
public class SubClass extends SuperClass1 {

	public void getBalance() {
		System.out.println("Calling display parent method.");
	}
	public static void main(String[] args) {

		SubClass subClass = new SubClass();
		subClass.show();
		subClass.display();
	}
}