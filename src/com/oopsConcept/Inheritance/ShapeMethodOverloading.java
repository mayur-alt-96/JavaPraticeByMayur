package com.oopsConcept.Inheritance;

public class ShapeMethodOverloading {

	public static void draw(int length, int height, int width) {
		System.out.println("Draw to trigale");
	}

	public static void draw(int height, int width, long lenght) {
		System.out.println("Draw to Square");

	}

	public static void draw(int height, int width) {
		System.out.println("Draw to circle");
	}

	public static void main(String[] args) {
//		ShapeMethodOverloading shapeMethodOverloading = new ShapeMethodOverloading();
//		shapeMethodOverloading.draw(10, 10, 10);
//		shapeMethodOverloading.draw(10, 10, 10l);
//		shapeMethodOverloading.draw(10, 10);
		
		draw(10, 10, 10);
		draw(10, 10, 10l);
		draw(10, 10);

	}
}