package com.topic.multithreading;

public class UsingThreadClass extends Thread {

	@Override
	public void run() {
		synchronized (this) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("value of " + i + " executed by " + Thread.currentThread().getName());
		}
		}
	}

	public static void main(String[] args) throws InterruptedException  {

		Thread thread1 = new UsingThreadClass();

		thread1.setName("Thread 1");
//		thread1.join();

		Thread thread2 = new UsingThreadClass();

		thread2.setName("Thread 2");

		thread1.start();
		thread2.start();
	} 		                       

}

// there are three ways to create thread.
// 1) using Thread class
// -- Extends Thread class in your class and override run method and in main
// method create the thread class Object and call start method.

//ref- UsingThreadClass.java

// 2) using Runnable interface
// -- We can not extends more than one classes that why runnable came to picture to create thread.
// -We need to implement runnable interface in your class which has run method
// you need to override that and create runnable object and pass that object to
// thread class constructor and call start() method.
// for more reference.
// ref - UsingRunnableInterface.java

// 3) using callable interface