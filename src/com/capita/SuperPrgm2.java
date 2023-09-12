package com.capita;

class ParentPrgm {

	public ParentPrgm(int x, int y) {
		System.out.println("Parent class con " + x + " " + y);
	}
	public ParentPrgm() {
		// TODO Auto-generated constructor stub
	}
}

public class SuperPrgm2 extends ParentPrgm{

	public SuperPrgm2(int x, int y) {
//		super(x, y);
		System.out.println("Child class con " + x + " " + y);
	}
	

	public static void main(String[] args) {
		
		ParentPrgm superPrgm2 = new SuperPrgm2(10, 20);
		ParentPrgm parent = new ParentPrgm(11,22);
		
	}
}
