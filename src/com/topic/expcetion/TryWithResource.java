package com.topic.expcetion;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TryWithResource {

	public static void main(String[] args) {

		String driverName = "oracle.jdbc.driver.OracleDriver";
		File file = new File("not_existing_file.txt");
		
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo", "root", "root");
				Statement statement = connection.createStatement();
				FileInputStream fileInputStream = new FileInputStream(file)) {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
