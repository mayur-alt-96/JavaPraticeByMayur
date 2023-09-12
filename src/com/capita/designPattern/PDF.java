package com.capita.designPattern;

public class PDF implements Report {

	@Override
	public void generate() {
		System.out.println("This is PDF method");
	}

}
