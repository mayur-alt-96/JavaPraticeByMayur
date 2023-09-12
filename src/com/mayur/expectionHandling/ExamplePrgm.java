package com.mayur.expectionHandling;

public class ExamplePrgm {
	
	private void show() {
		// TODO Auto-generated method stub
		try {
			int a =5/0;
			System.out.println(a);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("We can't divided by zero "+e);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ExamplePrgm examplePrgm = new ExamplePrgm();
		
		examplePrgm.show();
	}

}
