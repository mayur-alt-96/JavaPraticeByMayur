package com.topic.expcetion;

import java.io.IOException;

public class ExceptionImpl {

	public static void main(String[] args) {

		String str = null;
		
		if( 5 > 3) {
			
		}else {
			
		}

		try {
			getStringData(str);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	private static String getStringData(String str) throws IOException {

		return str.substring(0);
	}
}
