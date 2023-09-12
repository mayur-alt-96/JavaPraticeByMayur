package com.capita;

public class ThisImpl {

	int x, y;

	String name, address;// instance variable

	public ThisImpl() {
		this(10);
		System.out.println("Default constructor.");
	}

	public ThisImpl(int lenght) {
		this(10, 20);
		System.out.println("This is single parameterized constructor " + lenght);
	}

	public ThisImpl(int lenght, int size) {
		System.out.println("This is double parameterized constructor " + lenght + " and " + size);
	}

	public void getShow(int x, int y) {
		this.x = x;// 10
		this.y = y;// 20
		System.out.println("Value of x: " + this.x + " and y is :" + this.y);
		System.out.println("The Value of x: " + x + " and y is :" + y);
	}

	public void getDetails(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("This is getdetails method " + name + " and " + address);
	}

	public static void main(String[] args) {
		ThisImpl thisImpl = new ThisImpl();
		thisImpl.getShow(10, 20);
		thisImpl.getDetails("Mayur", "Kurha");

	}
}
// when we need to differentiate passing variable and instance variable then we use this keyword.
// this keyword is use to avoid variable ambuguity.when your passing varible name and decleared variable name is same then it will cause ambiguity.
// this always refer the current class object 
// this() method will use to call other constructor from other constructor. and this() method be the first line of any method.
// this() method will use to call all constructor in a single execution (in a single object creation);";"
