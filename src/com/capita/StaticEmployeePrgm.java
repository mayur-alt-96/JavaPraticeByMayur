package com.capita;

public class StaticEmployeePrgm {
	static String companyname = "C Brothers";
	String name;
	int age;
	
	static {
		System.out.println("Chokte che potte ahe");
	}

	public static void main(String[] args) {
		StaticEmployeePrgm staticEmployeePrgm = new StaticEmployeePrgm();
		
//		Nilesh.getName();
		Mayur.display();
		Mayur.show();
//		Nilesh.getFace();
		
		
		System.out.println("Employee related details");
		staticEmployeePrgm.name = "Sagar Sudamrao Chokte";
		staticEmployeePrgm.age = 31;

		System.out.println(staticEmployeePrgm.name);
		System.out.println(staticEmployeePrgm.age);
		System.out.println(StaticEmployeePrgm.companyname);

		staticEmployeePrgm.name = "Nilesh Diwakarao Chokte";
		staticEmployeePrgm.age = 29;

		System.out.println(staticEmployeePrgm.name);
		System.out.println(staticEmployeePrgm.age);
		System.out.println(StaticEmployeePrgm.companyname);

		staticEmployeePrgm.name = "Mayur Diwakarao Chokte";
		staticEmployeePrgm.age = 25;

		System.out.println(staticEmployeePrgm.name);
		System.out.println(staticEmployeePrgm.age);
		System.out.println(StaticEmployeePrgm.companyname);

	}
}
