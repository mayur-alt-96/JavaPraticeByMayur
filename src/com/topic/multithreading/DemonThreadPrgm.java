package com.topic.multithreading;

public class DemonThreadPrgm  extends Thread{

	
	@Override
	public void run() {

		if(Thread.currentThread().isDaemon()) {
			System.out.println("This is demon thread and thread name is " + Thread.currentThread().getName());
		}else {
			System.out.println("This is user thread and thread name is " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		
		Thread thread1 = new DemonThreadPrgm();
		Thread thread2 = new DemonThreadPrgm();
		thread1.setDaemon(true);
//		thread2.setDaemon(true);
		thread1.setName("Mayur");
		thread2.setName("Nikhil");
		thread1.start();
		thread2.start();
	}
}


// Demon thread are use to provice some service to user thread.
// demon thread will get terminate when user thrad will get finish.
// how we declear thread as a demon thread --> using setDeamon method and need to pass true value to it ex - thread1.setDeamon(true);.

//Points to remember for Daemon Thread in Java
// 1-It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
// 2-Its life depends on user threads.
// 3-It is a low priority thread.

//Why JVM terminates the daemon thread if there is no user thread?
//The sole purpose of the daemon thread is that it provides services to user thread 
//for background supporting task. If there is no user thread, why should JVM keep running this thread. 
//That is why JVM terminates the daemon thread if there is no user thread.