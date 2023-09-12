package com.capita;

class ParentPrgm1{
	
	public ParentPrgm1() {
		System.out.println("Parent class constructor A");
		// TODO Auto-generated constructor stub
	}
	public ParentPrgm1(int x) {
		System.out.println("Parent class constructor A "+ x);
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		System.out.println("Parent class show method");
	}
	public void display(int y) {
		System.out.println("Parent class display method "+y);
	}
	
	
}

class ChildPrgm1 extends ParentPrgm1{
	
	public ChildPrgm1() {
		System.out.println("Child 1 class constructor B");
		// TODO Auto-generated constructor stub
	}
	public ChildPrgm1(int x) {
//		super(x);
		System.out.println("Child 1 class constructor B " +x);
		// TODO Auto-generated constructor stub
	}
	public void show() {
		super.show();
		System.out.println("Child 1 class show method");
	}
	public void display(int y) {
		super.display(y);
		System.out.println("Child 1 class display method "+y);
	}
}

class ChildPrgm2 extends ChildPrgm1{
	
	public ChildPrgm2() {
		System.out.println("Child 2 class constructor C");
		// TODO Auto-generated constructor stub
	}
	public ChildPrgm2(int x) {
//		super(x);
		System.out.println("Child 2 class constructor C "+x);
		// TODO Auto-generated constructor stub
	}
	public void show() {
		super.show();
		System.out.println("Child 2 class show method");
	}
	public void display(int y) {
		super.display(y);
		System.out.println("Child 2 class display method "+y);
	}
	
	public void play() {
		System.out.println("Child 2 class play method ");
	}
	
}
public class SuperPrgm3 extends ChildPrgm2 {
	
	public SuperPrgm3() {
		System.out.println("SuperPrgm class constructor D");
		// TODO Auto-generated constructor stub
	}
	public SuperPrgm3(int x) {
		super(x);
		System.out.println("SuperPrgm class constructor D "+x);
		// TODO Auto-generated constructor stub
	}
	public void show() {
		super.show();
		System.out.println("SuperPrgm  class show method");
	}
	public void display(int y) {
		super.display(y);
		System.out.println("SuperPrgm class display method "+y);
	}
	public void play() {
		System.out.println("SuperPrgm class play method ");
	}

	public static void main(String[] args) {
		
//		SuperPrgm3 superPrgm = new SuperPrgm3();
//		System.out.println("  ");
//		superPrgm.show();
//		System.out.println("  ");
//		superPrgm.display(50);
//		SuperPrgm3 superPrgm3 = new SuperPrgm3(10);
		
		ChildPrgm2 prgm3 = new SuperPrgm3();
		System.out.println(" ");
//		prgm3.show();
		System.out.println(" ");
//		prgm3.display(30);
		System.out.println(" ");
		prgm3.play();
	}
}
