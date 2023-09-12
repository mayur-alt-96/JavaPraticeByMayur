package com.capita.designPattern;

public class PrintFactoryImpl {

	public static void getPrintFactory(String objValue) {
		if ("A4_Size_Print".equals(objValue)) {
			A4Print a4Print = new A4Print();
			a4Print.print();
		} else if ("Legal_Print".equalsIgnoreCase(objValue)) {
			LegalPrint legalPrint = new LegalPrint();
			legalPrint.print();
		} else if ("Colour_Print".equalsIgnoreCase(objValue)) {
			ColourPrint colourPrint = new ColourPrint();
			colourPrint.print();
		} else if ("Black and White_Print".equalsIgnoreCase(objValue)) {
			BlackAndWhitePrint blackAndWhitePrint = new BlackAndWhitePrint();
			blackAndWhitePrint.print();
		}
	}
}