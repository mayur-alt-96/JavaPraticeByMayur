package com.mayur.practice;

public class Calculator {

	public static void main(String[] args) {

//		division(10, 0);
//
//		addtion(10, 30);
//
//		subtraction(50, 20);

		multiplication(2, 45266);

	}

	private static void multiplication(int x, int y) {

		if (x >= 0 && y >= 0) {
			System.out.println("Multiplication result is " + (x * y));
		} else {
			System.out.println("Enter the positive value ");
		}
	}

	private static void subtraction(int x, int y) {

		if (x >= 0 && y >= 0) {
			System.out.println("Subtraction result is " + (x - y));
		} else {
			System.out.println("Enter the positive value ");
		}
	}

	private static void addtion(int x, int y) {

		if (x >= 0 && y >= 0) {
			System.out.println("Addition result is " + (x + y));

		} else {
			System.out.println("Enter the positive value like 0 or more than 0");
		}
	}

	private static void division(int x, int y) {

		if (y > 0) {
			int z = x / y;
			System.out.println("Divide result is " + z);
		} else {
			System.out.println("Enter other than zero");
		}
	}

}
