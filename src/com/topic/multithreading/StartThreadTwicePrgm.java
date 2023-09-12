package com.topic.multithreading;

public class StartThreadTwicePrgm extends Thread {

	@Override
	public void run() {
		System.out.println("calling run method." + Thread.currentThread().getPriority()+" and "+ hashCode());
	}

	public void show() {
		System.out.println("calling show method");
	}

	public static void main(String[] args) {

		
		Thread thread = new StartThreadTwicePrgm();
		thread.start();
		thread.start();
	
	}
}

// we can start the same thread again 
