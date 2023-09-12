package com.mayur.designPattern;

public class LaptopBuilderDesignPattern {

	public static void main(String[] args) {

		Laptop laptop1 = new Laptop.LaptopBuilder("HP", "A-15").build();

		System.out.println(laptop1);

		Laptop laptop2 = new Laptop.LaptopBuilder("Dell", "D-5").lapProccessor("Quad-8").lapWarranty(1).lapPrice(55000.00).build();

		System.out.println(laptop2);
	}
}
