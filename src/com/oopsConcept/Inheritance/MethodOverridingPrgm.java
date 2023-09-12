package com.oopsConcept.Inheritance;

class Superclass {
	int x;
	public Superclass(int x) {
		System.out.println("Calling parent variable "+x);
	}
	public void interestrate() {
		System.out.println("RBI is giving 5 per IR");
	}

	public void show() {
		System.out.println("calling parent class show method.");
	}
	
	protected void display() {
		System.out.println("calling parent display method");
	}

}

public class MethodOverridingPrgm extends Superclass {

	public MethodOverridingPrgm(int x) {
		super(x);
		System.out.println("Calling child variable "+x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interestrate() {
//		super.interestrate();
		System.out.println("we will give 4 per if customer taking double loan.");
	}

	@Override
	public void show() {
		super.show();
		System.out.println("calling child class show method");
	}
	
	public void checkMethod() {
		System.out.println("Child class check method");
	}


	public static void main(String[] args) {

		Superclass methodOverridingPrgm = new MethodOverridingPrgm(10);
//		methodOverridingPrgm.interestrate();
//		Superclass.show();
//		methodOverridingPrgm.show();
//		methodOverridingPrgm.display();
//		Superclass superclass = new Superclass();
//		superclass.interestrate();
		MethodOverridingPrgm test = new MethodOverridingPrgm(0);
		test.display();
		test.checkMethod();
		
	}
}
