package com.topic.multithreading;

class Sample1 extends Thread {
	public void run() {
		System.out.println("task one");
	}
}

class Simple2 extends Thread {
	public void run() {
		System.out.println("task two");
	}
}
public class Simple {
	public static void main(String args[]) throws InterruptedException {
		Sample1 t1 = new Sample1();
		Simple2 t2 = new Simple2();
		t1.start();
		t1.join();
		t2.start();
	}
}
