package com.capita.String;

public final class OwnImmutableClass2 {

	final String panCardNumber;

	public OwnImmutableClass2(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}

	private final String getPanCardNumber() {
		return panCardNumber;

	}

	public static void main(String[] args) {

		OwnImmutableClass2 ownImmutable = new OwnImmutableClass2("ABC123");
		System.out.println("Pan Card Number : " + ownImmutable.getPanCardNumber());
	}
}
