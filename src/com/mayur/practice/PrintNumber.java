package com.mayur.practice;

import java.io.Serializable;

public class PrintNumber implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int num = 0;

	public static void main(String[] args) {
		printNum();
		for (int j = 0; j < 5; j++) {
			System.out.println("Nilesh");
			if (j < 2) {
				break;
			}
		}

		checkValue("Mayur", 10, 111.0);
	}

	private static Object checkValue(String name, int i, double d) {
		return null;

		
	}

	public static void printNum() {
		if (num < 5) {
			++num;
			System.out.print(num + " ");
			printNum();
		}

	}
}
