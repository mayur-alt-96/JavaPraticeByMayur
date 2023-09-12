package com.topic.expcetion;

public class ErrorPrgm {


	public static void main(String[] args) {
		
		ErrorPrgm errorPrgm = new ErrorPrgm();
		errorPrgm.show();
	}
	
	public void show() {
		System.out.println("calling show method");
		show();
	}
}
