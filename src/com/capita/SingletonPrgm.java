package com.capita;

class Singleton{
	private static Singleton singleton;
	
	public static Singleton getInstance() {

		if(singleton==null) {
		singleton = new Singleton();
		System.out.println("Singleton object has been created." +singleton.hashCode());
		return singleton;
		}
		System.out.println("Singleton object has been created already so we are not creating that.." +singleton.hashCode());
		return singleton;
	}
}
public class SingletonPrgm {
	public static void main(String[] args) {

		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(Singleton.getInstance().hashCode());
	}
}