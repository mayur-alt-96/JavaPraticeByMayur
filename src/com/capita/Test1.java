package com.capita;

public class Test1 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.println("Display mathod return " + test1.display("Nilesh"));

	}

	private String display(String value) {
		getName(10);
		show(10, "Mayur");
		getAddress("Kurha");
		System.out.println("Calling display method");
		return value;
	}

	private void getAddress(String string) {
		// TODO Auto-generated method stub
		System.out.println("Calling getAddress method");
		
	}

	private void getId(int i) {
		System.out.println("Calling getId method");
	}

	private void getName(int i) {
		System.out.println("Calling getName method");
		getId(12);

	}

	private static void show(int i, String string) {
		System.out.println("Calling show method");
	}

}
