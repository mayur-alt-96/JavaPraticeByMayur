package com.oopsConcept.Inheritance;

class SBIBank{
	
	void show() {
		System.out.println("Show sbi method");
	}
}

class RBIBank {

	public void interestRate(int x) {
		System.out.println("RBI Interest rate is " + x + " %");
	}

	public void minimumBalance(int y) {
		System.out.println("Minimum balance should be "+ y);
	}

	public void homeLoan() {
		System.out.println("Maximum honeloan will get 1500000");
	}
}

public class KotakBank extends RBIBank {
	
//	void show() {
//		super.show();
//		System.out.println("Show kotak method");
//	}

	public void interestRate(int x) {
		super.interestRate(x);
		System.out.println("Kotak Interest rate is " + x + " %");
	}

	public static void main(String[] args) {

		KotakBank kotakBank = new KotakBank();
		kotakBank.interestRate(10);
		kotakBank.minimumBalance(200);
		kotakBank.homeLoan();
//		kotakBank.show();

	}

}
