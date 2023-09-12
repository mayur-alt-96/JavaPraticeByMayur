package com.capita.String;

public final class OwnImmutableClass1 {
	private final int x = 10;
	private final int y = 20;
	final String name;

	public final int show() {
		System.out.println("Calling Show method");
		return x;
	}

	public final void setMethod() {
		System.out.println("Calling set method");

	}

	public OwnImmutableClass1(String name) {
		this.name = name;
		System.out.println("Calling Constructor is " + x + " and " + y + " and " + name);
	}

	public static void main(String[] args) {
		OwnImmutableClass1 class1 = new OwnImmutableClass1("Mayur");
		class1.show();
		class1.setMethod();

	}

}
