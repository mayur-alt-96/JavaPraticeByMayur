package com.capita.String;

import com.sun.xml.internal.bind.v2.runtime.Name;

import sun.awt.SunHints.Value;

public class StringSample {

	public static void main(String[] args) {

		String s = "Mayur";
		String s1 = "Nilesh";
		String s2 = "Sagar";
		String s3 = "Chokte";
		String s4 = "Chokte";
		String s7 = "chokte";
		String s8 = "Mayur Diwakar Chokte 1 2 3 3";
		String s9 = "";// for empty case

		// charAt()-> find character
//		char ch = s1.charAt(2);
//		System.out.println(ch);

		// * hashcode()//*
//System.out.println(s3.hashCode());
//System.out.println(s4.hashCode());
//System.out.println(s2.hashCode());

		// compareTo()-> compare ascii value
//System.out.println(s3.compareTo(s1));
//System.out.println(s3.compareTo(s));

		// concat()- join two words in a single line
//		String s5 = s2.concat("Chokte");
//		String s6 = s.concat("Chokte");
//	System.out.println(s5);	
//	System.out.println(s6);	

		// contains()- find the contains in the word/line
//		System.out.println(s.contains("e"));
//		System.out.println(s1.contains("e"));

		// endWith()-end character value is ture/false
//		System.out.println(s.endsWith("r"));
//		System.out.println(s1.endsWith(" "));

		// equals() -check the value is ture/false
//		System.out.println(s3.equals(s4));
//		System.out.println(s3.equals(s));

		// equalsIgnoreCase() -check the value is ture/false
//		System.out.println(s3.equalsIgnoreCase(s7));
//		System.out.println(s3.equalsIgnoreCase(s1));

		// indexOf() - which no. of value/character start from line give value of it
//		int index = s8.indexOf("Chokte");
//		System.out.println("Index start from " + index);

		// isEmpty()- give the value is ture/false
//		System.out.println(s8.isEmpty());
//		System.out.println(s9.isEmpty());

		// join()- join the character/value
//		String date = String.join("/", "25", "06", "2018");
//		System.out.print(date);
//		String time = String.join(":", "12", "10", "10");
//		System.out.println(" and " + time);
//		String s10= String.join("-","Mayur","Chokte","10");
//		System.out.println(s10);

		// lastIndexOf()
//		int index1=s8.lastIndexOf("e");
//		System.out.println(index1);

		// length()
//		System.out.println("String length is "+s.length());

		// replace()
//		String replace=s8.replace("Diwakar", "Diwakarrao");
//				System.out.println(replace);

		// replaceAll()
//		String s11 = "My name is Khan. My name is Bob. My name is Sonoo.";
//		String replaceAll = s11.replaceAll("is", "Are");
//		System.out.println(replaceAll);

		// split->Split the value/character but we need to space in between
//		String[] split=s8.split("\\s");
//		for(String w :split) {
//			System.out.println(w);
//		}

		// startsWith()
//		System.out.println(s.startsWith("M"));
//		System.out.println(s.startsWith("m"));

		// subString()
//		String sb = s8.substring(0);
//		System.out.println(sb);
//		String sb1 = s8.substring(6);
//		System.out.println(sb1);

		// swapping two strings without using third one.
//		s = s + s8;
//		System.out.println("The Total value is " + s);
//
//		System.out.println("s is " + s.substring(s.length() - s8.length()));
//		System.out.println("s8 is " + s.substring(0, s.length() - s8.length()));
//
//	System.out.println(s8.length());

		// toLowerCase()
//		String lower="MAYUR CHOKTE";
//		System.out.println(lower.toLowerCase());

		// toCharArray
//		char[] charArray = s8.toCharArray();
//		int len = charArray.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println(charArray[i]);
//		}

		// toUpperCase()
//		String upper ="mayur chokte";
//		System.out.println(upper.toUpperCase());

		// trim()
//		String tr ="     Mayur      ";
//		System.out.println(tr.trim());

		// valueOf
//		int x = 10;
//		String name = "Mayur";
//		int parseInt = Integer.parseInt(name);//we get NumberFormatException in this method
//		System.out.println(parseInt);

//		String value = String.valueOf(x);
//		System.out.println(value);
//		show(String.valueOf(x));
//		show(x + "");

		// StringBuffer
		StringBuffer buffer = new StringBuffer("Mayur");
		buffer.append("Chokte");
		System.out.println("output is " +buffer);

//		String sName="10";
//		System.out.println("This integer value "+Integer.parseInt(sName));
//		System.out.println("This double value "+Double.parseDouble(sName));
//		
//	}
//	public static void show(String name) {
//		System.out.println("Calling show method " + name);
	}

}