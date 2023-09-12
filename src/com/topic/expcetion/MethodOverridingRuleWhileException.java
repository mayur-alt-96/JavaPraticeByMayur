package com.topic.expcetion;

import java.io.IOException;
import java.sql.SQLException;

class SuperClass {

	public void show() throws ClassNotFoundException, SQLException  {
		System.out.println("calling show method from parent class");
	}
	public SuperClass() {
		System.out.println("Superclass Constructor");
	}
}

public class MethodOverridingRuleWhileException extends SuperClass {

	@Override
	public void show() throws ArrayIndexOutOfBoundsException{
		System.out.println("calling show method from child class");
	}
	public MethodOverridingRuleWhileException() {
		System.out.println("Method Overriding Rule While Exception constructor");
	}

	public static void main(String[] args) throws IOException, SQLException {
		MethodOverridingRuleWhileException methodOverridingRuleWhileException = new MethodOverridingRuleWhileException();
		methodOverridingRuleWhileException.show();
	}

}

// rule 1-> if my parent class method throwing checked Exception then child class method can throws same
//          checked exception and unchecked exception also but can not throws super exception (ex - exception or throwable).
// Rule 2-> if my parent class method throwing unchecked exception then child class method can only
//          throws same type of unchecked exception but can not throws super exception ( ex - exception or throwable). 
// Rule 3-> if my parent class method not throwing any exception then child class method can only throws unchecked exception.
// Rule 4-> if my parent class method throwing checked and unchecked Exception then 
//          subclass overridden method  can declare the same subclass exception or no exception but cannot declare parent exception.



//class SuperClass{
//	public void display()throws ArrayIndexOutOfBoundsException{
//		System.out.println("Calling display method from parent class");
//	}
//}
//public class MethodOverridingRuleWhileException extends SuperClass{
//	
//	public static void main(String[] args)  {
//		SuperClass methodOverridingRuleWhileException = new MethodOverridingRuleWhileException();
//		methodOverridingRuleWhileException.display();
//	}
//}