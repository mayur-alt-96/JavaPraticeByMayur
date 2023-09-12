package com.topic.expcetion;

public class Finalize {

	public static void main(String[] args) {
		Finalize finalize = new Finalize();
		Finalize.dislpay();
		finalize = null;
		System.gc();
		System.out.println("Object destroy/collected");
	}

	private static void dislpay() {
		System.out.println("Calling Display Method");
	}
	protected void finalize() {
		System.out.println("Calling finalize method");
	}
}
