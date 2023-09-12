package com.oopsConcept.Inheritance;

abstract class MobilesPrgm {

	public abstract void vivo();

	public abstract void samsung();

	abstract void oppo();

	public abstract void realme();

	protected MobilesPrgm(int num) {
//		System.out.println("Mobile num " + num);
	}
}

public class Mobiles extends MobilesPrgm {

	public Mobiles(int num) {
		super(num);
		// TODO Auto-generated constructor stub
		System.out.println("Mobile number " + num);
	}

	@Override
	public void vivo() {
		System.out.println("This is vivo mobile");
	}

	@Override
	public void samsung() {
		System.out.println("This is samsung mobile");
	}

	@Override
	void oppo() {
		System.out.println("This is oppo mobile");
	}

	@Override
	public void realme() {
		System.out.println("This is realme mobile");
	}

	public static void main(String[] args) {
		Mobiles mobiles = new Mobiles(10000);
		mobiles.vivo();
		mobiles.samsung();
		mobiles.oppo();
		mobiles.realme();
	}
}
