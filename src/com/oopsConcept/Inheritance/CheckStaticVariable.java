package com.oopsConcept.Inheritance;

public class CheckStaticVariable {
		int x;
		public void show(int x) {
			System.out.println("Calling show method : "+x);
		}
		
		public static void  display(int x) {
			System.out.println("Calling display method : "+x);
		}
	
	public static void main(String[] args) {
		
		CheckStaticVariable checkStaticVariable = new CheckStaticVariable();
		checkStaticVariable.show(10);
		display(11);;
		
	}
}
