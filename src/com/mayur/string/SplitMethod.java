package com.mayur.string;

public class SplitMethod {

	public static void main(String[] args) {

		String s1 = "java string split method by javatpoint";

		String[] split = s1.split("\\s");

		for (String string : split) {

			System.out.println(string);
		}
		System.out.println();

		String[] split2 = s1.split("\\s");
		for (String string1 : split2) {
			System.out.println(string1);
		}
	}
}
