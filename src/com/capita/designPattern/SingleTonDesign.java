package com.capita.designPattern;

class SingletonPattern implements Cloneable {

	public static SingletonPattern connection;

	public static SingletonPattern getSingletonObject() {

		if (null == connection) {
			connection = new SingletonPattern();
			System.out.println("Connection has been created." + connection.hashCode());
			return connection;
		}
		System.out.println("Connection has been created already so we are not creating that.." + connection.hashCode());
		return connection;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
	}
}

public class SingleTonDesign {

	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonPattern singletonObject = SingletonPattern.getSingletonObject();
		SingletonPattern singletonObjectNew = (SingletonPattern) singletonObject.clone();
		System.out.println(singletonObject.hashCode());
		System.out.println(singletonObjectNew.hashCode());
	}
}
