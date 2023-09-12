package com.topic.multithreading;

public class MultipleThreadCall1 extends Thread {

	public void run() {
		System.out.println("one");
	}

	public static void main(String[] args) {
		Thread threadCall1 = new MultipleThreadCall1();
		Thread threadCall2 = new MultipleThreadCall1();
		Thread threadCall3 = new MultipleThreadCall1();

		threadCall1.start();
		threadCall2.start();
		threadCall3.start();
	}
}
