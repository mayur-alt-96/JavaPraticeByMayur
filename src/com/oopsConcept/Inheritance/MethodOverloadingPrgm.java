package com.oopsConcept.Inheritance;

class MethodOverloadingPrgm {

	public void show(long x, int y) {
		System.out.println("Calling show method : " + x + " and " + y + "\n");
	}

	public String show(int z, long x) {
//		System.out.println("Calling show method with parameter : " + z + " and " + x + "\n");
		return "Calling show method with parameter : " + z + " and " + x;
	}

	public String check(int a) {
		System.out.println("Check  method is call : " + a + "\n");
		return "Check  method is call";
	}

	public static void main(String[] args) {

		MethodOverloadingPrgm methodOverloadingPrgm = new MethodOverloadingPrgm();
		methodOverloadingPrgm.show(10l, 10);
		methodOverloadingPrgm.show(10, 10l);
		methodOverloadingPrgm.check(11);
	}
}