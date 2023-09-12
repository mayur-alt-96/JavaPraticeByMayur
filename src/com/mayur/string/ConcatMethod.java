package com.mayur.string;

public class ConcatMethod {

	public static void main(String[] args) {

		String s1 = "Mayur";
		String s2 = "Chokte";
		String s = "Family";

		String s3 = s1.concat(" "+s2);
		System.out.println(s3);
		
		String s4 = s2.concat(" Mayur Diwakar");
		System.out.println(s4);
		
		String s5 = s1.concat(" Diwakar Chokte");
		System.out.println(s5);
		
		System.out.println("The concat value is "+s1.concat(" "+s2));
		
		System.out.println(s2.concat(" "+s));
	}
}
