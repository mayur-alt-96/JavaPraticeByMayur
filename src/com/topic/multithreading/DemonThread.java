package com.topic.multithreading;

public class DemonThread extends Thread {

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is demon thread and thread name is " + Thread.currentThread().getName());
		} else {
			System.out.println("This is user thread and thread name is " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		Thread thread1 = new DemonThread();
		Thread thread2 = new DemonThread();
		Thread thread3 = new DemonThread();
		
		thread1.start();
		thread1.setName("Nilesh");
		thread1.setDaemon(true);
		thread2.start();
		thread2.setName("Mayur");
		thread3.start();
		thread3.setName("Sagar");
	}
}
