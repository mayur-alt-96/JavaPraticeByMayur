package com.capita.designPattern;

class Singleton /*implements Cloneable*/ {

	public static Singleton connectionSingleTon;

	public static Singleton getSingletonObject() {

		if (null == connectionSingleTon) {
			connectionSingleTon = new Singleton();
			System.out.println("Connection object has been created.");
			return connectionSingleTon;
		}
		System.out.println("Connection object has been created already so we are not creating that..");
		return connectionSingleTon;
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		throw new CloneNotSupportedException();
//	}

}

public class SingletonDesignPattern {

	public static void main(String[] args) throws CloneNotSupportedException {

		Singleton singletonObject = Singleton.getSingletonObject();
		Singleton singletonObject1 = Singleton.getSingletonObject();
//		Singleton Singletonnew = (Singleton) singletonObject.clone();

		System.out.println(singletonObject.hashCode());
//		System.out.println(Singletonnew.hashCode());
	}
}
