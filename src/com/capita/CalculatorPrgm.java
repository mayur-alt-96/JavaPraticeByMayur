package com.capita;

//public class CalculatorPrgm {
//	public static void main(String[] args) {
//		System.out.println("Calculator");
//		CalculatorPrgm calculatorPrg = new CalculatorPrgm();
//		calculatorPrg.addtion();
//		calculatorPrg.subtraction();
//		calculatorPrg.multiplication();
//		calculatorPrg.division();
//		
//	}
//
//	private void addtion() {
//		System.out.println("Addtion of 10 and 20 is " + (10 + 20));
//	}
//
//	private void subtraction() {
//		System.out.println("Subtraction of 20 and 10 is" + (20 - 10));
//	}
//
//	private void division() {
//		System.out.println("Division of 20 and 2 is " + (20 / 2));
//	}
//
//	private void multiplication() {
//		System.out.println("Multiplication of 10 and 10 is" + (10 * 10));
//	}
//}

public class CalculatorPrgm {
	public static void main(String[] args) {
		System.out.println("Calculator");
		CalculatorPrgm calculatorPrgm = new CalculatorPrgm();
		calculatorPrgm.addition();
		calculatorPrgm.subtraction();
		calculatorPrgm.division();
		calculatorPrgm.multiplication();
	}

	private void addition() {
		System.out.println("Addition of 211 and 95 is " + (211 + 95));
	}

	private void subtraction() {
		System.out.println("Subtraction of 211 and 95 is " + (211 - 95));
	}

	private void division() {
		System.out.println("Division of 211 and 9 is " + (211 / 9));
	}

	private void multiplication() {
		System.out.println("Multiplition of 211 and 95 is " + (211 * 95));
	}
}