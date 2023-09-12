package com.capita;

//public class MobilePrgm {

//	public static void main(String[] args) {
//		System.out.println("Mobile");
//		MobilePrgm mobilePrgm = new MobilePrgm();
//		mobilePrgm.oppo();
//		mobilePrgm.redmi();
//		mobilePrgm.apple();
//		mobilePrgm.samsung();
//		mobilePrgm.vivo();
//	}
//
//	private void apple() {
//		System.out.println("This is apple mobile");
//	}
//
//	private void samsung() {
//		System.out.println("This is samsung mobile");
//	}
//
//	private void vivo() {
//		System.out.println("This is vivo mobile");
//	}
//
//	private void oppo() {
//		System.out.println("This is oppo mobile");
//	}
//
//	private void redmi() {
//		System.out.println("This is redmi mobile");
//	}
//}

public class MobilePrgm {
	public static void main(String[] args) {
		MobilePrgm mobilePrgm = new MobilePrgm();
		mobilePrgm.apple();
		mobilePrgm.samsung();
		mobilePrgm.redmi();
		mobilePrgm.vivo();
		mobilePrgm.oppo();
	}

	private void apple() {
		System.out.println("Apple Mobile");
	}

	private void samsung() {
		System.out.println("Samsung Mobile");
	}

	private void redmi() {
		System.out.println("Redmi Mobile");
	}

	private void vivo() {
		System.out.println("Vivo Mobile");
	}

	private void oppo() {
		System.out.println("Oppo Mobile");
	}
}
