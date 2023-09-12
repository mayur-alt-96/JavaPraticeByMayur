package com.topic.multithreading;

public class UsingRunnableInterface implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("value of " + i + " executed by " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable1 = new UsingRunnableInterface();

		Thread thread1 = new Thread(runnable1);

		thread1.join();
		thread1.setName("Mayur thread");

		Thread thread2 = new Thread(runnable1);
		thread2.setName("Nilesh thread");
		thread1.start();
		thread2.start();

	}
}
