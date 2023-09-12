package com.topic.multithreading;

public class StartThreadTwice extends Thread {

	@Override
	public void run() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " and thread name is " + Thread.currentThread().getName() + " and priority is "
					+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new StartThreadTwice();
		Thread thread2 = new StartThreadTwice();
		Thread thread3 = new StartThreadTwice();

		thread1.setName("Mayur");
//		thread1.setPriority(MAX_PRIORITY);
		thread1.setPriority(11);
		thread2.setName("Nilesh");
		thread2.setPriority(NORM_PRIORITY);
		thread3.setName("Sagar");
		thread3.setPriority(MIN_PRIORITY);

		thread1.start();
		thread1.start();
//		thread1.sleep(1000);
		
		thread2.start();
		thread2.join();
//		thread2.sleep(2000);
		
		thread3.start();
//		thread3.sleep(3000);
		Thread.yield();
	}
}
