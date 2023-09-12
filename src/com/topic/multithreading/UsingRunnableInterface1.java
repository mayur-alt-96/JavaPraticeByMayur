package com.topic.multithreading;

public class UsingRunnableInterface1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Value of " + i + " excuted by " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		Runnable runnable1 = new UsingRunnableInterface1();

		Thread thread1 = new Thread(runnable1);

		thread1.setName("Mayur");
		thread1.start();
		Thread thread = new Thread(runnable1);

		thread.setName("Chokte");
		thread.start();

	}

}
