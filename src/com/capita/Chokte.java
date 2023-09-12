package com.capita;

public class Chokte {
	static {

		System.out.println("Calling chokte static block");
	}

	public static void getMethod() {
		System.out.println("Calling get method method");
	}

	public static void callMethod() {
		System.out.println("Calling call method ");
	}
}