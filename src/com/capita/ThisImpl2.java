package com.capita;

public class ThisImpl2 {

	int x, y, z;

	public ThisImpl2(int x, int y, int z) {
		this.x = x;	
		this.y = y;
		this.z = z;
		System.out.println(x + " and " + y + " and " + z);
	}

	void display(int x, int y, int z) {
		System.out.println(x + " and " + y + " and " + z);
//		System.out.println(this.x + " and " + this.y + " and " + this.z);
	}
	

	public static void main(String[] args) {
		ThisImpl2 thisImpl2 = new ThisImpl2(10, 20, 30);
		thisImpl2.display(11, 12, 13);
//		thisImpl2.display(14, 15, 16);
	}
}
