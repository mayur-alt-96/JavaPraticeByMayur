	package com.capita.String;

public class SampleStringPrgm {

	public static void main(String[] args) {

		String str = "Mayur";
		String str1 = "Mayur";
		String str2 = new String("Mayur");
		String str4 = new String("Mayur");
		String str3 = "Mayur41";
//
//		System.out.println(str);
//		System.out.println(str1);
//		System.out.println(str2);
//
//		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str4.hashCode());
//		System.out.println(str3.hashCode());

//		str = str.concat("chokte");
//		System.out.println(str);
//		System.out.println(str.hashCode());

//		String str4 = new String("Nikhil");
//		str4 = str4.concat("chokte");
//		String str5 = new String("Nikhil");
//		System.out.println(str4);
//		System.out.println(str5);
//		System.out.println(str4.hashCode());
//		System.out.println(str5.hashCode());
//
		if (str4.equals(str1)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}

		if (str3 == str1) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}
//		if (str.equals(str4)) {
//			System.out.println("same");
//		} else {
//			System.out.println("different");
//		}
	}
}

// we can create String object by two ways.
// - using literals ex String str ="Mayur"--it will store in String contanst pool.
// - Using new keyword ex- String str = new String("Mayur") - it will store in head and SCP.
// why string is immutable.
// ans - because when we create ten object using literals with same values so it will go to String constant pool and it will create only one object other will refer to the address.
// - if i am able to change it then all other object will changes that why the
// have made String as a immutable.
// String constant pool will internally use Flyweight design pattern.
//String has == and equals method
// - == method will check address.
// - equals method will check contains.


