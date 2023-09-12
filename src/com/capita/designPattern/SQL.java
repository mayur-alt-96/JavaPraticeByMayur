package com.capita.designPattern;

public class SQL implements Report {

	@Override
	public void generate() {
		System.out.println("This is SQL Report");
	}
}
