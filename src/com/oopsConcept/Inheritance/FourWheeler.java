package com.oopsConcept.Inheritance;

class MiniVan {
	public void mini() {
	}
}

interface Car1 {
	public void car();
}

public class FourWheeler extends MiniVan implements Car1 {

	@Override
	public void car() {
		System.out.println("This is car");
	}

	@Override
	public void mini() {
		System.out.println("This is Mini Van");
//		super.mini();
	}
public static void main(String[] args) {
	FourWheeler wheeler = new FourWheeler();
	wheeler.car();
	wheeler.mini();
}
}
