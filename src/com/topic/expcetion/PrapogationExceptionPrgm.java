package com.topic.expcetion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrapogationExceptionPrgm {

	public static void main(String[] args) {

		PrapogationExceptionPrgm prapogationExceptionPrgm = new PrapogationExceptionPrgm();
		try {
			prapogationExceptionPrgm.display();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			prapogationExceptionPrgm.show();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	private void display() throws FileNotFoundException {
		System.out.println("calling display method");
		show();
	}
	private void show() throws FileNotFoundException {
		System.out.println("calling show method");
		File file = new File("not_existing_file.txt");
		FileInputStream stream = null;
		stream = new FileInputStream(file);

	}

}
