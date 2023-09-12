package com.capita.String;

public final class OwnImmutableClass {

	final String pancardNumber;

	public OwnImmutableClass(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

//	public String getPancardNumber() {
//		return pancardNumber;
//	}

	public final void show() {
		System.out.println("Show method");
	}

	public final String getPancardNumber() {
		return pancardNumber;
	}

	public static void main(String[] args) {
		OwnImmutableClass Object = new OwnImmutableClass("ABC123");
//		String s1 = Object.getPancardNumber();
		System.out.println("Pancard Number: " + Object.getPancardNumber());
		Object.show();
	}
}