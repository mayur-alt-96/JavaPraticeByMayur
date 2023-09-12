package com.capita;

public class StaticPrgm1 {

	int age;

	String name;

	static String address = "Kurha";


	public static void main(String[] args) {
		StaticPrgm1 prgm1 = new StaticPrgm1();
		prgm1.age = 25;
		prgm1.name = "Mayur";
		System.out.println("Candidates details");
		System.out.println(prgm1.age);
		System.out.println(prgm1.name);
		System.out.println(StaticPrgm1.address);
		Sagar.showMethod();
		Sagar.displayMethod();
	}
	static {
		System.out.println("Calling Chokte from kurha");
	}
}
