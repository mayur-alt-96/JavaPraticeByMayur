package com.topic.multithreading;

public class ThreadLifeCyclePrgm extends Thread {

	@Override
	public void run() {


			for (int i = 0; i < 5; i++) {
				System.out.println(i + " and thread name is " + Thread.currentThread().getName() + " and priority is "+ Thread.currentThread().getPriority());

//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		}
	}

	public static void main(String[] args) {

		Thread thread1 = new ThreadLifeCyclePrgm();
		Thread thread2 = new ThreadLifeCyclePrgm();
		Thread thread3 = new ThreadLifeCyclePrgm();

		thread1.setName("Mayur");
		thread1.setPriority(NORM_PRIORITY);
		thread2.setName("Nilesh");
		thread2.setPriority(MAX_PRIORITY);
		thread3.setName("Nikhil");
		thread3.setPriority(MIN_PRIORITY);

		thread1.start();
		

//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			thread1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread2.start();
		Thread.yield();
//		try {
//			thread2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		thread3.start();

	}
}

//below are thread life cycle 
//1) new
// desc -when we create thread object that is new state. ex Thread thread= new ThreadLifeCyclePrgm();

//2)Active
//-desc - when you call start method of thread class.ex- thread.start() (thread is a object).

//3) Running -->
// desc --> CPU start proccessing your thread means it started executing your run() method.

// 4) waiting/blocking
// desc - when you call Thread.sleep(1000) that time your thread will goes to wait state.

//5) exit 
// desc- when thread are done with their execution.