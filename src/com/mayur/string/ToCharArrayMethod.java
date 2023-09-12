package com.mayur.string;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		
		String s1="java string split method by javatpoint";  

		char[] ch =s1.toCharArray();
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}
}
