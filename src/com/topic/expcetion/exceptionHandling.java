package com.topic.expcetion;

public class exceptionHandling {

	public static void main(String[] args) {
		try {
			int x = 100 / 2;
			System.out.println("Excution done");// TODO: handle exception
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
//			System.exit(0);
		} finally {
			System.out.println("Rest of code excuted");
		}
	}
}
