package com.capita.abstraction;

interface order {
	public void prod();
}

interface order1 {
	public void prod();
}

interface customer extends order, order1 {

	abstract void show();

	public void display();

	public void face();

	public void maxSpeed(int x);

	void getHome();

}

public class InterfaceImpl implements customer {

	int speed;

	@Override
	public void show() {

		System.out.println("calling show method");
	}

	@Override
	public void display() {

		System.out.println("calling display method.");
	}

	@Override
	public void face() {
		System.out.println("this is face method");

	}

	@Override
	public void maxSpeed(int speed) {
		this.speed = speed;
		System.out.println("Bike speed is " + this.speed);
	}

	public static void main(String[] args) {

		customer interfaceImpl = new InterfaceImpl();
		interfaceImpl.show();
		interfaceImpl.display();
		interfaceImpl.face();
		interfaceImpl.maxSpeed(100);
	}

	@Override
	public void getHome() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prod() {
		// TODO Auto-generated method stub

	}
}
