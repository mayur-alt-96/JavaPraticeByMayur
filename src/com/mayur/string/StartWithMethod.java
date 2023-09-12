package com.mayur.string;

public class StartWithMethod {

	public static void main(String[] args) {
		
		String s1="java string split method by javatpoint";  

		System.out.println(s1.startsWith("j"));
		System.out.println(s1.startsWith("s"));
		System.out.println(s1.startsWith("j", 0));
		System.out.println(s1.startsWith("j", 1));
		System.out.println(s1.startsWith("j", 28));
		boolean startsWith = s1.startsWith("j",4);
		System.out.println(startsWith);
		boolean startsWith2 = s1.startsWith("j");
		System.out.println(startsWith2);
	}
}
