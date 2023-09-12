package com.mayur.string;

public class SwapTwoNumber {

	public static void main(String[] args) {

		//Swapping two String without using third one
		String s1 = "LexCorp";
		String s2 = "Mayur_Chokte";

		s1 = s1 + s2;
		System.out.println("The total value is " + s1);

		System.out.println("s1 is " + s1.substring(s1.length() - s2.length()));
		System.out.println("s2 is " + s1.substring(0, s1.length() - s2.length()));
		
		
		System.out.println("==============================================================");
		

		String i = "9975509648";
		String j = "33226544441";

		i = i + j;
		System.out.println("The total value is " + i);

		System.out.println("I is " + i.substring(i.length() - j.length()));
		System.out.println("J is " + i.substring(0, i.length() - j.length()));

		System.out.println("==============================================================");
		
		//Swapping two numbers without using third one
		int x= 10;
		int y = 50;
		
		x =x+y;
		System.out.println("Total is "+x);
		
		y=x-y;
		System.out.println("Y value is "+y);
		
		x=x-y;
		System.out.println("X value is "+x);
	}
}
