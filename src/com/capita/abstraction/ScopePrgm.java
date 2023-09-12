package com.capita.abstraction;

public class ScopePrgm {

	public static void main(String[] args) {

		ScopePrgm scopePrgm = new ScopePrgm();
		scopePrgm.show();
		scopePrgm.display();
		scopePrgm.print();
		scopePrgm.draw();
	}

	public void show() {
		System.out.println("calling show method.");
	}

	private void display() {
		System.out.println("calling display method.");
	}

	void print() {
		System.out.println("calling default print method.");
	}

	protected static void draw() {
		System.out.println("calling protected draw method.");
	}
}
	
	// private - it can only use in same class.
	// default -  inside the class and  outside the class but within the package.- when we are not defining any scope for any method then by default scope will be default.
	// protected - inside the class and  outside the class and out the package also if we inherite the class.
	// public - we can use anywhere.