package com.capita;

public class SwitchPrgm {

	public static void main(String[] args) {

//		int number = 1;
//
//		switch (number) {
//
//		case 1:
//			System.out.println("Enter number is 1");
//			break;
//
//		case 2:
//			System.out.println("Enter number is 2");
//			break;
//
//		case 3:
//			System.out.println("Enter number is 3");
//			break;
//
//		default:
//			System.out.println("Enter number is wrong");
//
//		}

		String floorNumber = "three";

		switch (floorNumber) {
		case "one":
			System.out.println("You have select number 1 floor");
			break;
		case "two":
			System.out.println("You have select number 2 floor");
			break;
		case "three":
			System.out.println("You have select number 3 floor");
			break;
		default:
			System.out.println("Enter number is wrong");

		}
	}
}
