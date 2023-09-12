package com.mayur.string;

public class InternMethod {

	public static void main(String[] args) {

		String s1 = new String("Mayur");
		String s2 = "Mayur".intern();

		String s3=s1.intern();
		
		System.out.println(s1 ==s2);
		System.out.println(s2 ==s3);

		String s4 = "Mayur".intern();

		System.out.println(s2 == s4);
	}
}
