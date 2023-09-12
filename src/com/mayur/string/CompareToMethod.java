package com.mayur.string;

public class CompareToMethod {

	public static void main(String[] args) {

		String s1 = "Mayur";
		String s2 = "Chokte";

		int s3 = s1.compareTo(s2);
		System.out.println(s3);

		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo("Nilesh Chokte"));
		System.out.println(s2.compareTo(s1));
		int compareTo = s2.compareTo(s1);
		System.out.println(compareTo);

	}

}
