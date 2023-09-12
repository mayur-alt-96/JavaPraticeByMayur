package com.topic.multithreading;

public class MultipleThreadCall {

	public static void main(String[] args) {
		
		Thread thread = new Thread() {
			public void run() {
				
				System.out.println("calling run method");
			}; 
			
		};
		thread.run();
	}
}
