package com.topic.expcetion;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TrywithResoucePrgm {

	public static void main(String[] args) {
		String driverName = "oracle.jdbc.driver.OracleDriver";
		File file = new File("not_existing_file.txt");
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
				Statement stmt = connection.createStatement();
				FileInputStream fileInputStream = new FileInputStream(file)) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// what is try with resource - this feature has been introduce in java7 and which use to close connection , file without using finally block.
// how it will do it?-> by using AutoCloseable interface which has close method to close all connection and file.