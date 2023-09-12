package com.oopsConcept.Inheritance;

public class PrinterOverloadingPrgm {

	public void print(String A4size) {
		System.out.println("We are giving print for : " + A4size);
	}

	public void print(String lazerPrinter, String poster) {
		System.out.println("We are giving print for : " + lazerPrinter + " and values is which contain the moment " + poster);
	}

	public void print(String poster, int printCopies) {
		System.out.println("We are printing " + poster + " with copies " + printCopies);
	}

	public void print(int printCopies, String poster) {
		System.out.println("we are printing : " + printCopies + " copies of poster " + poster);
		show();
	}

	public static void main(String[] args) {
		PrinterOverloadingPrgm object = new PrinterOverloadingPrgm();

		object.print("A4size");
		object.print("poster", 500);
		object.print("lazer", "election poster");
		object.print(500, "Student banner");
		object.display(10);
	}

	public void show() {
		System.out.println("calling show method");
		display();
	}

	public void display() {

		System.out.println("calling display method");
	}

	public void display(int x) {

		System.out.println("calling display method " + 10);
	}
}
