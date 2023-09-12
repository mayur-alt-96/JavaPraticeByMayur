package com.topic.multithreading;

public class UsingThreadClass1 extends Thread {

	@Override
	public void run() {
//		synchronized
		for (int i = 0; i <= 10; i++) {
			System.out.println("Value of " + i + " excuted by " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		Thread Thread1 = new UsingThreadClass();
		Thread1.setName("Mayur");
		Thread1.start();
		Thread Thread2 = new UsingThreadClass1();
		Thread2.setName("Nilesh");
		Thread2.start();
	}
}
