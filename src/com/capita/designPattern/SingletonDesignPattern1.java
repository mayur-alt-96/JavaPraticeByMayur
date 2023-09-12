package com.capita.designPattern;

class Singleton1 implements Cloneable {
	private static Singleton1 connectiondb = new Singleton1();

	public static Singleton1 getInstance() {

		if (connectiondb == null) {
			System.out.println("Connection db has been created.");
			return connectiondb;
		}
		System.out.println("Connection db has been created.");
		return connectiondb;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}

public class SingletonDesignPattern1 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton1 instance = Singleton1.getInstance();
		Singleton1 singleton1 = (Singleton1)instance.clone();
	}
}