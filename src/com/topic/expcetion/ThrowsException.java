package com.topic.expcetion;

public class ThrowsException {

	public static int divide(int x, int y) throws ArithmeticException {
		int div = x / y;
		return div;
	}

	public static void main(String[] args) {
		
		excepHandling();
	}

	private static void excepHandling() {
		ThrowsException throwsException = new ThrowsException();
		
		try {
			System.out.println(throwsException.divide(6, 0));
		}
		catch(ArithmeticException e){
			System.out.println("/yNumber cannot be divided by 0");
		}
		System.out.println("Rest of the codes");
	}

//	private void show() throws FileNotFoundException, ClassNotFoundException {
//		System.out.println("Calling show method");
//		file();
//	}
//
//	private void file() throws FileNotFoundException, ClassNotFoundException {
//		File file = new File("not_existing_file.txt");
//		FileInputStream stream = null;
//		FileInputStream fileInputStream = new FileInputStream(file);
//
//		Connection connection = null;
//		String driverName = "oracle.jdbc.driver.OracleDriver";
//		Class.forName(driverName);
//	}
//
//	public static void main(String[] args) {
//		ThrowsException throwsException = new ThrowsException();
//
//		try {
//			throwsException.show();
//		} catch (FileNotFoundException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}finally {
//			System.out.println("this will execute no matter what.");
//		}
//
//	}
}
