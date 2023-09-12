package com.oopsConcept.Inheritance;

class Car {
	void run() {
		System.out.println("Run by differnt cars ");
	}
	void show(String name ){
		System.out.println("Show by differnt cars " + name);
		
	}
}

class BMW extends Car {
//	void run1() {
//		System.out.println("This is BMW car");
//	}
	@Override
	void run() {
		System.out.println("This is BMW car");
		super.run();
	}
	void show(int num) {
		System.out.println("Show by cars " +num);
		
	}
	public void speed() {
		System.out.println("This is BMW car and speed is "+ 150);
	}
	
}

class Audi extends Car {
//	void run2() {
//		System.out.println("This is Audi car");
//	}
	
}

public class MultiLevelInherit {

	public static void main(String[] args) {

		BMW bmw = new BMW();
		bmw.run();
		bmw.show("Lomborgini");
		bmw.show(10);
//		bmw.run1();
		bmw.speed();
		Audi audi = new Audi();
		audi.run();
//		audi.show("Mayur");
//		audi.run2();
	}
}
