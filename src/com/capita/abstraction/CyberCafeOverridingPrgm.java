package com.capita.abstraction;

class Internet {
	public void CPU() {
		System.out.println("For Data Strorage");
	}
}

interface Monitor {
	public void Screen();
}

public class CyberCafeOverridingPrgm extends Internet implements Monitor {

	@Override
	public void Screen() {
		System.out.println("For monitor");
	}

	public static void main(String[] args) {
		CyberCafeOverridingPrgm cyberCafeOverridingPrgm = new CyberCafeOverridingPrgm();
		cyberCafeOverridingPrgm.CPU();
		cyberCafeOverridingPrgm.Screen();
	}
}