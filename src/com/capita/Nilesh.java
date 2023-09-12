package com.capita;

public class Nilesh {
	static int x;
	static int y;
	static {
		x=100;
		System.out.println("Calling Nilesh " +x);
	}
//	static {
//		System.out.println("Calling Mayur");
//		System.out.println("Calling Sagar");
//	}
//	static {
//		System.out.println("Calling Chokte");
//	}
//
//	static {
//		System.out.println("Calling Baba");
//	}

	public static void getName() {
		y = 10;
		System.out.println("Calling getName "+y);
	}

	public static void getFace() {
		System.out.println("Get a Face Method");
		Mayur.show();
		Mayur.display();

	}

	public static void main(String[] args) {
		Nilesh.getName();
		Nilesh.getFace();

//		StaticPrgm staticPrgm = new StaticPrgm();
//		staticPrgm.name = "Nilesh";
//		staticPrgm.age = 30;
//		System.out.println("Candidate details");
//		System.out.println(staticPrgm.name);
//		System.out.println(staticPrgm.age);
//		System.out.println(StaticPrgm.address);

	}
}
