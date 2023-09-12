package com.mayur.string;

public class EndWithMethod {

	public static void main(String[] args) {
		
		String s1="Welcome To Amravati Maharashtra";
		
		boolean s2 =s1.endsWith("e");
		System.out.println(s2);
		
		System.out.println("The endWith given suffix is "+s1.endsWith("tra"));
		System.out.println("The endWith given suffix is "+s1.endsWith("Tra"));
		System.out.println("The endWith given suffix is "+s1.endsWith("ra"));
		System.out.println("The endWith given suffix is "+s1.endsWith("TRA"));
		
	}
}
