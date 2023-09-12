package com.topic.expcetion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.sun.corba.se.pept.transport.Connection;

public class MultipleException {

	public static void main(String[] args) {
		
		MultipleException exception = new MultipleException();
		try {
			exception.fileCheck();
		} catch (FileNotFoundException |ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		divide(100,0);
	}

	private void fileCheck() throws FileNotFoundException, ClassNotFoundException {
		File file = new File("not_existing_file.txt");
		FileInputStream stream = null;
		stream= new FileInputStream(file);
		
		Connection connection = null;
		String driverName = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driverName);
	}

	private static void divide(int i, int j){
		try {
		int x =i/j;
		System.out.println(x);
		}catch (ArithmeticException | NumberFormatException e) {
		System.out.println(e);
		}
		System.out.println("Rest of code is done");
	}
}
