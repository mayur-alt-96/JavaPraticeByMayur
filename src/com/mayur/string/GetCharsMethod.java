package com.mayur.string;

public class GetCharsMethod {

	public static void main(String[] args) {

//		String s1 = new String("Mayur Chokte");
//
//		char[] ch = new char[10];
//
//		s1.getChars(0, 5, ch, 0);
//
//		System.out.println(ch);

		String s2 = "Mayur Chokte";

//		char[] c = new char[8];
//		s2.getChars(0, 8, c, 0);
//		System.out.println(c);

		
		char[] s = new char[8];
		s2.getChars(0, 4, s, 0);
		System.out.println(s);
		
	}
}
