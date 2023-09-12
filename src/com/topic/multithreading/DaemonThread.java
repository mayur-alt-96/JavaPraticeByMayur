package com.topic.multithreading;

public class DaemonThread extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is Daemon thread and thread name is " + Thread.currentThread().getName());
		} else {
			System.out.println("This is user thread and thread name is " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		DaemonThread thread = new DaemonThread();
		DaemonThread thread1 = new DaemonThread();
		DaemonThread thread2 = new DaemonThread();

		thread.start();
		thread.setDaemon(true);
		thread.setName("Sagar");
		thread1.start();
		thread1.setName("Nilesh");
		thread2.start();
		thread2.setName("Mayur");
	}
}
