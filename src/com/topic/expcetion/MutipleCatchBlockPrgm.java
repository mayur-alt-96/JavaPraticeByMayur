package com.topic.expcetion;

import java.io.File;
import java.io.FileInputStream;

public class MutipleCatchBlockPrgm {

	public static void main(String[] args) {

		try {
			int a[] = new int[10];
//			File file = new File("not_existing_file.txt");
//			FileInputStream stream = null;
//			FileInputStream fileInputStream = new FileInputStream(file);
			System.out.println(a[10]);
//			a[5] = 30 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOfBound exception");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
		} catch (Exception e) {
			System.out.println("Parent  exception");
		}
		System.out.println("Rest of code");
	}
}
