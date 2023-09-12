package com.mayur.string;

public class EqualsIgnoreCaseMethod {

	public static void main(String[] args) {
		
		String s1 ="Mayur";
		String s2 ="Nilesh";
		String s3 ="mayur";
		String s4 ="Mayur Chokte";
		String s5 ="NILESH";
		
		boolean b = s1.equalsIgnoreCase(s3);
		System.out.println(b);
		System.out.println(s2.equalsIgnoreCase(s5));
		System.out.println(s1.equalsIgnoreCase(s4));
		
//		int s6 =Integer.parseInt(s5);  //This method is for convert Word object into number.
//		System.out.println(s6);
	}
}
