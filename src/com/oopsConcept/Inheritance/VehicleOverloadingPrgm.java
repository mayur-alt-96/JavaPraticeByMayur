package com.oopsConcept.Inheritance;

public class VehicleOverloadingPrgm {

	public void run(int speed, String name) {
		System.out.println("speed " + speed + " and name is " + name);
	}

	public void run(int speed, String name, String width) {
		System.out.println("speed " + speed + " and name is " + name + " and width(meter) is " + width);
	}

	public void run(int speed, String name, String height, int weight) {
		System.out.println(
				"speed " + speed + " and name is " + name + " and height is " + height + " and weight(kg) is " + weight);
	}

	public static void main(String[] args) {
		VehicleOverloadingPrgm vehicleOverloadingPrgm = new VehicleOverloadingPrgm();
		vehicleOverloadingPrgm.run(20, "Bicycle");
		vehicleOverloadingPrgm.run(30, "Bike", "two");
		vehicleOverloadingPrgm.run(50, "Car", "one", 400);
	}
}
