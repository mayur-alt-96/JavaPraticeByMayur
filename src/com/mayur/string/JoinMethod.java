package com.mayur.string;

public class JoinMethod {

	public static void main(String[] args) {

		String s1 = String.join("/", "Welcome", "To", "Amravati", "Maharashtra");

		System.out.println(s1);

		String join = String.join("*", "Mayur", "Diwakar", "Chokte");
		System.out.println(join);
	}
}
