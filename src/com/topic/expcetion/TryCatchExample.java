package com.topic.expcetion;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample {
//
//	public static void main(String[] args) {
////		int i = 50;
////		int j = 0;
////		int data;
//		try {
//			int arr[] = { 1, 3, 5, 7 };
//			System.out.println(arr[10]);
////			int data1 = 50 / 0;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
////		System.out.println("Can't divided by zero");
////		System.out.println(i / (j + 2));
//		System.out.println("Rest of code");
//
//	}
//}

	public static void main(String[] args) {

		PrintWriter pw;
		try {
			pw = new PrintWriter("jtp.txt");
			pw.println("Saved");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("File saved successfully");
	}
}