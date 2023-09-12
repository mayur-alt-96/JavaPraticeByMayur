package com.topic.expcetion;

public class FinalizePrgm {

	private final static String NAME = "Nikhil";
	private final static String TEA_PRICE = "12";
	

	public static void main(String[] args) {

		FinalizePrgm finalizePrgm = new FinalizePrgm();
//		finalizePrgm.show();
		finalizePrgm = null;

		System.gc();
	}

	private void show() {
		System.out.println(NAME);
		System.out.println("Calling show show method");
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(NAME);
		System.out.println("This is finalize method");
	}
}

// when you want to do some operation before garbage collector pick up your object . that we can achive through finalize() method.
//This method we no need to call it will get call before you object get garbage collected.