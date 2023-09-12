package com.topic.expcetion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;

import java.sql.Connection;

//public class CheckExpcetionPrgm {
//	public static void main(String[] args) {
//		File file = new File("not_existing_file.txt");
//		FileInputStream stream = null;
//		try {
//			stream = new FileInputStream(file);
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		Connection connection = null;
//		String driverName = "oracle.jdbc.driver.OracleDriver";
//		try {
//			Class.forName(driverName);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}

public class CheckExceptionPrgm {
	public static void main(String[] args) {
		File file = new File("not_existing_file.txt");
		try {
			FileInputStream stream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		String driverName = "oracle.jdbc.driver.oracleDriver";
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
