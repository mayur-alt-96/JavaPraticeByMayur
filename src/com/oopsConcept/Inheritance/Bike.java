package com.oopsConcept.Inheritance;

abstract class Vehicle {
	public void run() {
		System.out.println("Vehicle is running ");
	}

	public abstract void show();

	public abstract void print();

	public abstract void vehiclepart();

	public void insurancepolicy() {
		System.out.println("2 lac insurance");
	}
}

interface Train {

	abstract void localTrain();

	abstract void expressTrain();

	abstract void superfastTrain(int x);
}

public class Bike extends Vehicle implements Train {

	@Override
	public void show() {
		System.out.println("calling show method");
	}

	@Override
	public void print() {
		System.out.println("Calling print method");
	}

	@Override
	public void vehiclepart() {
		System.out.println("This is vehicle parts");
	}

	public void insurancepolicy() {
		super.insurancepolicy();
		System.out.println("5 lac insurance");
	}

	@Override
	public void localTrain() {
		System.out.println("This is local train");
	}

	@Override
	public void expressTrain() {
		System.out.println("This is express train");

	}

	@Override
	public void superfastTrain(int x) {
		System.out.println("This is superfast train "+x);

	}

	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.run();
		bike.show();
		bike.print();
		bike.vehiclepart();
		bike.insurancepolicy();
		bike.localTrain();
		bike.expressTrain();
		bike.superfastTrain(2020);
	}
}
