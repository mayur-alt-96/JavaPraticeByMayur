package com.mayur.string;

public class EqualsMethod {

	public static void main(String[] args) {
		
		String s1 ="Mayur";
		String s2 ="Nilesh";
		String s3 ="Mayur";
		String s4 ="Mayur Chokte";
		
		boolean equals = s1.equals(s4);
		System.out.println(equals);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));
	}
}
