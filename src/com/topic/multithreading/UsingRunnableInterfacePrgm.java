package com.topic.multithreading;

public class UsingRunnableInterfacePrgm implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("The value of " + i + " excuted by " + Thread.currentThread().getName()+ " And Priority is "+Thread.currentThread().getPriority());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new UsingRunnableInterfacePrgm();
		Thread thread = new Thread(runnable);
		thread.setName("Mayur Chokte Thread");
		thread.setPriority(2);
		thread.start();
		thread.join();

		Thread thread2 = new Thread(runnable);
		thread2.setName("Nilesh Chokte Thread");
		thread2.setPriority(10);
		thread2.start();
	}
}
