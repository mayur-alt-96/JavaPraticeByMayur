package com.mayur.string;

public class SubStringMethod {

	public static void main(String[] args) {
		
		String s1="java string split method by javatpoint";  

		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 17));
		System.out.println(s1.substring(5, s1.length()-14));
		System.out.println(s1.length()-17);
		
	}
}
