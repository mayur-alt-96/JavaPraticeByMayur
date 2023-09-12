package com.topic.multithreading;

public class UsingThreadClassPrgm extends Thread {
	
	@Override
	public void run() {

		for(int i=0; i<=10; i++) {
			System.out.println("The value of "+i+ "excuted by "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		 Thread thread1 = new UsingThreadClassPrgm();
		 thread1.setName("Mayur Thread");
		 thread1.start();
		 try {
			thread1.join();
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		 Thread thread2 = new UsingThreadClassPrgm();
		 thread2.setName("Nilesh Thread");
		 thread2.start();
	}
}
