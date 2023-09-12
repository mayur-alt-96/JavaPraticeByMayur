package com.capita.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	private static final long serialVersionUID = 7132414562255576148L;

	int id;
	static String name ="Nilesh";

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

public class Persist {
	public static void main(String args[]) {
		serialization();
		deSerialization();

	}

	private static void serialization() {
		try {
			System.out.println("calling serialization method");

			Student s1 = new Student(40, "Nikhil");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void deSerialization() {
		try {

			System.out.println("calling deserialization method");
			// Creating stream to read the object
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
			Student s = (Student) in.readObject();
			// printing the data of the serialized object
			System.out.println(s.getId() + " " + s.getName());
			// closing the stream
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}