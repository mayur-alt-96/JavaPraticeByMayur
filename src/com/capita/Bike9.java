package com.capita;

//import sun.applet.Main;
final class Bike {
}

//class Tvs extends Bike {
//}

public class Bike9 {
	final int speedlimit = 90;

	void run() {
//		speedlimit = 70;
		System.out.println("Bike test");
	}

	public static void main(String[] args) {
		Bike9 bike9 = new Bike9();
		bike9.run();
	}
}

//Rule 1--> Final variable cannot be changed
//rule 2-->Final methods cannot be override.
// rule 3 -->final class can not extend
