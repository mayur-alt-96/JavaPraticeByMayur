package com.topic.expcetion;

import java.io.IOException;

class SuperClass1 {

	public void show() {
		System.out.println("Calling show method from parent class");
	}

	public void diplay() {
		System.out.println("Calling Display method from parent class");
	}
}

public class MethodOverridingRuleException extends SuperClass1 {

	@Override
	public void show() throws NullPointerException{
		super.show();
		super.diplay();
		System.out.println("Calling show method from Child class");
	}

	public void diplay(){
		System.out.println("Calling Display method from child class");
	}

	public static void main(String[] args) throws Exception {
		SuperClass1 methodOverridingRuleException = new MethodOverridingRuleException();
		methodOverridingRuleException.show();
		methodOverridingRuleException.diplay();
		
//		SuperClass1 superClass1 = new SuperClass1();
//		superClass1.show();
//		superClass1.diplay();

	}
}
