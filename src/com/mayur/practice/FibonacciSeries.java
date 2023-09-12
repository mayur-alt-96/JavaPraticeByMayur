package com.mayur.practice;

public class FibonacciSeries {

	public static void main(String[] args) {

//		int n1 = 0, n2 = 1, n3, i, count = 15;
//		System.out.println(n1 + " " + n2);
//
//		for (i = 2; i < count; ++i) {
//			n3 = n1 + n2;
//			System.out.println(" " + n3);
//			n1 = n2;
//			n2 = n3;
//		}

		int x1 = 0, x2 = 1, x3, i, count = 10;

		System.out.print(" " + x1);
		System.out.print(" " + x2);
		for (i = 0; i < count; ++i) {
			x3 = x1 + x2;

			System.out.print(" " + x3);
			x1 = x2;
			x2 = x3;
		}
		System.out.println("                    ");
		int y1 = 0, y2 = 1, y3, count1 = 10, j;

		System.out.print(y1);
		System.out.print(" " + y2);
		for (j = 0; j < count1; j++) {
			y3 = y1 + y2;
			System.out.print(" " + y3);
			y1 = y2;
			y2 = y3;
		}

	}
}
