package com.topic.expcetion;

public class ArrayIndexPrgm {

	public static void main(String[] args) {
		ArrayIndexPrgm arrayIndexPrgm = new ArrayIndexPrgm();
		arrayIndexPrgm.show();
		arrayIndexPrgm.display();

	}

	private void display() {
		float a;
		a = 30 / 7;
		try {
			System.out.println("value of is " + a);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	private void show() {
		int a[] = {0,  1 , 2 , 3 };
		try {
			System.out.println("value of is " + a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
