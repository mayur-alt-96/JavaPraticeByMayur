package com.mayur.string;

public class ContainsMethod {

	public static void main(String[] args) {
		
		String s1 ="Welcome To Amravati Maharashtra";
		
		boolean s2 = s1.contains("vati");
		System.out.println(s2);
	
	    System.out.println("The contain in literal object is "+s1.contains("w"));
	    
	    System.out.println(s1.contains("tra"));
	}
}
