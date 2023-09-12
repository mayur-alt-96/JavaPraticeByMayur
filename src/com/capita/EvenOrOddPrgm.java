package com.capita;

//public class EvenOrOddPrgm {
//
//	public static void main(String[] args) {
//
//		EvenOrOddPrgm evenOrOddPrgm = new EvenOrOddPrgm();
//		evenOrOddPrgm.findEvenOdd(20);
//		evenOrOddPrgm.printValue("Nilesh");
//
//	}
//
//	private void printValue(String name) {
//		System.out.println("Name is Nilesh");
//
//	}
//
//	private void findEvenOdd(int number) {
//		if (number % 2 != 0) {
//			System.out.println("Given number is odd :" + number);
//		} else {
//			System.out.println("Given number is even : " + number);
//		}
//	}
//
//}

public class EvenOrOddPrgm {
	public static void main(String[] args) {
		EvenOrOddPrgm evenOrOddPrgm = new EvenOrOddPrgm();
		evenOrOddPrgm.findEvenOdd(50);
		evenOrOddPrgm.printvalue("Nilesh");
	}

	private void printvalue(String name) {
		System.out.println("Name is Nilesh");
	}

	private void findEvenOdd(int number) {
		if (number % 20 != 0) {
			System.out.println("Given number is odd :" + number);
		} else {
			System.out.println("Given number is even :" + number);

		}
	}
}