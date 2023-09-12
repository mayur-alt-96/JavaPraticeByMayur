package com.topic.expcetion;

class Stud {

	String name;
	int id;

	public int getId() {
		return id;
	}

	private void setid() {
		// TODO Auto-generated method stub

	}

	private void getname() {
		// TODO Auto-generated method stub

	}

	private void setname() {
		// TODO Auto-generated method stub

	}
}

public class UncheckedExceptionPrgm {

	public static void main(String[] args) {

		// below code is for null pointer.
		nullPointerMethodCheck();

		// below code for arithmatic expcetion
		arithMaticExceptinCheck();}
		
	private static void arithMaticExceptinCheck()  throws ArithmeticException{
		try {
			int x = 100 / 0;
			System.out.println(x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void nullPointerMethodCheck() {
		String str = "Mayurs";
		try {
			str.toUpperCase();
			System.out.println(str.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Stud stud = null;
		if (stud != null) {
			System.out.println(stud.getId());
		}
		System.out.println("calling");
	}
}
