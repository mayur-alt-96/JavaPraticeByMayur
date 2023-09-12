package com.capita.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	transient String address;

	public Emp(int id, String name, String address) {

		this.id = id;
		this.name = name;
		this.address = address;
	}

}

public class SerializationExample {

	public static void main(String[] args) throws IOException {

		serialization();
		deSerialization();
	}

	private static void serialization() throws IOException {

		try {
			System.out.println("Calling serialization method");

			Emp emp = new Emp(10, "Mayur", "Kurha");

			System.out.println(emp.id + " " + emp.name + " and " + emp.address);
			FileOutputStream fileOutputStream = new FileOutputStream("f.txt");

			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(emp);

			objectOutputStream.flush();

			objectOutputStream.close();
			System.out.println("Successful serialization");
			System.out.println();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	private static void deSerialization() {

		try {
			System.out.println("Calling deserialization method");
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("f.txt"));

			Emp emp = (Emp) objectInputStream.readObject();

			System.out.println(emp.id + " " + emp.name + " and " + emp.address);

			objectInputStream.close();

		} catch (Exception e) {

			System.out.println(e);

		}
	}
}
