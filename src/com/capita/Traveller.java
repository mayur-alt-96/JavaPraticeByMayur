package com.capita;

interface Vehicle {
	void move();
}

class Car implements Vehicle {
	public void move() {
		System.out.println("Calling move method from car class");
	}
}

class Bikes implements Vehicle {
	public void move() {
		System.out.println("Calling move method from bike");
	}
}

class MotorCycle implements Vehicle {
	public void move() {
		System.out.println("Calling move method from MotorCycle");
	}
}

public class Traveller {

	Vehicle v;

	public void setV(Vehicle v) {
		this.v = v;
	}

	void startJourney() {
		v.move();
	}

	public static void main(String[] args) {

		Traveller traveller = new Traveller();

		Vehicle carVehicle = new Car();
		Vehicle bikeVehicle = new Bikes();
		Vehicle motorVehicle = new MotorCycle();
		traveller.setV(motorVehicle);
		traveller.startJourney();

	}

}
