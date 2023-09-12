package com.topic.expcetion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;

public class ThrowsvsThrowPrgm {

	public static void main(String[] args) {

		ThrowsvsThrowPrgm throwsvsThrowPrgm = new ThrowsvsThrowPrgm();
		try {
			throwsvsThrowPrgm.show();
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void show() throws FileNotFoundException, ClassNotFoundException {

		System.out.println("calling show method");
		fileCheck();
	}

	private void fileCheck() throws FileNotFoundException, ClassNotFoundException {
		try {
			int i =50/0;
		} catch (Exception e) {
			System.out.println("Zero can not divide any value");
		}
		File file = new File("not_existing_file.txt");
		FileInputStream stream = null;
		stream = new FileInputStream(file);

		Connection connection = null;
		String driverName = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driverName);
	}
}

//throws use to throw exception and it always use with method. whenever we throws exception then we need to catch that exception where that method get called.



//public class ThrowsvsThrowPrgm {  
//    //defining a method  
//    public static int divideNum(int m, int n) throws ArithmeticException {  
//        int div = m / n;  
//        return div;  
//    }  
//    //main method  
//    public static void main(String[] args) {  
//        ThrowsvsThrowPrgm obj = new ThrowsvsThrowPrgm();  
//        try {  
//            System.out.println(obj.divideNum(45, 5));  
//        }  
//        catch (ArithmeticException e){  
//            System.out.println("\nNumber cannot be divided by 0");  
//        }  
//          
//        System.out.println("Rest of the code..");  
//    }  
//} 