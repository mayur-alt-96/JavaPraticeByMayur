package com.mayur.expectionHandling;

public class NumberFormatPrgm {

	String String = "OneTwoThree";

	public static void main(String[] args) {
		try {
			int parseInt = Integer.parseInt("OneTwoThree");
			System.out.println(parseInt);
		} catch (NumberFormatException e) {
			System.out.println(e);
			System.err.println("Invalid input of String");
		}
		System.out.println("Continue Excution....");
	}

}
