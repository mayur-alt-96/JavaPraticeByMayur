package com.mayur.practice;

public class PositiveAndNegative {
	public static void main(String[] args) {
		positivteNegativeCheck(10);
	}

	private static void positivteNegativeCheck(int x) {
		if (x >= 0) {
			System.out.println("Given value is positive " + x);
		} else {
			System.out.println("Given value is negative " + x);

		}
	}

}
