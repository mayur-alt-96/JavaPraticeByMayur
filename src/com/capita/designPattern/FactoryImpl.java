package com.capita.designPattern;

public class FactoryImpl {

	public static void getFactory(String objValue) {

		if ("PDF".equalsIgnoreCase(objValue)) {
			Report pdfReport = new PDF();
			pdfReport.generate();
		} else if ("XML".equalsIgnoreCase(objValue)) {
			Report xmlReport = new XML();
			xmlReport.generate();
		} else if ("CSV".equalsIgnoreCase(objValue)) {
			Report csvReport = new CSV();
			csvReport.generate();
		} else if ("JPG".equalsIgnoreCase(objValue)) {
			Report jpgReport = new JPG();
			jpgReport.generate();
		} else if ("SQL".equalsIgnoreCase(objValue)) {
			Report sqlReport = new SQL();
			sqlReport.generate();
		} else if ("DOCS".equalsIgnoreCase(objValue)) {
			Report docsReport = new DOCS();
			docsReport.generate();
		}
	}
}
