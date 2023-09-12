package com.capita.abstraction;

class Vehicle {
	public void run() {
		System.out.println(" Vehicle is running ");
	}

}

interface helmet {
	public void forhead();
}

public class BikeOverrridingPrgm extends Vehicle implements helmet {

//	@Override
//	public void run() {
//		System.out.println("Bike is running ");
//	}

	public static void main(String[] args) {

		BikeOverrridingPrgm bikeOverrridingPrgm = new BikeOverrridingPrgm();
//		bikeOverrridingPrgm.run();
		bikeOverrridingPrgm.forhead();

	}

	@Override
	public void forhead() {
		System.out.println("Helmet is Compulsary");
	}

}