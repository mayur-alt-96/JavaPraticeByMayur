package com.capita.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Car implements Externalizable {
	static int age;
	transient String name;
	int year;
	String address;

	public Car() {
		System.out.println("Default Constructor called");
	}

	Car(String n, int y) {
		this.name = n;
		this.year = y;
		age = 10;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(year);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		year = in.readInt();
		age = in.readInt();
	}

	@Override
	public String toString() {
		return ("Name: " + name + "\n" + "Year: " + year + "\n" + "Age: " + age + " and Address " + address);
	}
}

public class ExternExample {
	public static void main(String[] args) {
		Car car = new Car("Shubham", 1995);
		Car newcar = null;

		// Serialize the car
		serialization(car);

		// Deserialization the car
		deserialization(car, newcar);
	}

	private static void serialization(Car car) {
		try {
			FileOutputStream fo = new FileOutputStream("gfg.txt");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(car);
			so.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void deserialization(Car car, Car newcar) {
		try {
			FileInputStream fi = new FileInputStream("gfg.txt");
			ObjectInputStream si = new ObjectInputStream(fi);
			newcar = (Car) si.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("The original car is:\n" + car);
		System.out.println("The new car is:\n" + newcar);
	}

}