package com.capita;
class ParentCon{
	public ParentCon() {
		System.out.println("Calling parent class con");
	}
	
}
public class Constructors extends ParentCon {

	public Constructors() {
		System.out.println("Calling constructor");// TODO Auto-generated constructor stub
	}

	public void show() {

		System.out.println("Calling show method");// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Constructors constructors = new Constructors();
		
	}
}
