package com.topic.expcetion;

public class SampleExceptionPrgm {

	public static void main(String[] args) {

		calling();

	}

	private static void calling() {
		System.out.println("calling statement 1");
		System.out.println("calling statement 2");

//		int x = 100 / 0;

		try {
			String str = "Nilesh";
			int y = Integer.parseInt(str);
			System.out.println(y);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("calling finally blocks");
		}
		System.out.println("calling statement 8");
		System.out.println("calling statement 9");
	}
}

//public class SampleExceptionPrgm {
//	public static void main(String[] args) {
//		calling();
//
//	}
//
//	private static void calling() {
//		System.out.println("calling statement 1");
//		System.out.println("calling statement 2");
//
////		int x = 100 / 0;
//		try {
//			String str = "Mayur";
//			int y = Integer.parseInt(str);
//			System.out.println(y);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			System.out.println("Calling Chokte");
//		}
//		System.out.println("calling statement 5");
//		System.out.println("calling statement 6");
//
//	}
//}

// exception -> problem occurs while executing problem and execution will stop in between. to handle that we are using exception handling concept.
// below are the keywords which use to handle expception.
// 1) try --> actual logic will written in try block.
// 2) catch--> execption will trace or print in catch block
// 3) finally --> not matter what finally block will execute.--> finally block
// will use to close connection(Database level), closing files.
// 4) throws
// 5) throw
// can we use try block without using catch block-> answer is Yes but we need to
// use try with finally.

// super class of exception handling is --> Throwable 
// Exception --> there are two types of exceptions
// 1) check exception --> compile time exception.
// 2) unchecked exception --> run time exception.

//1) Check Exception --> This exception occurs at compile time and we need to handle that using try/catch or throws ex-IOException , ClassNotFound , FileNotFound
// refer -CheckExpcetionPrgm.java
//2) Unchecked Exception --> This exception occurs at run time and we need to handle that using try/catch or throws ex- NullPointer, ArithMatic(divided by 0), ArrayIndexOfBound.
// refer - UncheckedExceptionPrgm.java
