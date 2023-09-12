package com.mayur.practice;

public class WithoutUsingThirdVariable {
	public static void main(String[] args) {
		String s1 = "Mayur Chokte";
		String s2 = "Amravati Maharashtra";

		s1 = s1 + s2;
		System.out.println("The total value is " + s1);

		System.out.println("s1 is " + s1.substring(s1.length() - s2.length()));
		System.out.println("s2 is " + s1.substring(0, s1.length() - s2.length()));
	}
}
