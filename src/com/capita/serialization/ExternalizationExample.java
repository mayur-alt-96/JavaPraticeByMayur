package com.capita.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Vehicle implements Externalizable {

	static int age;
	String name;
	transient int year;
	String address;

	public Vehicle() {
		System.out.println("Default constructor called");
	}

	Vehicle(String n, int y, String a) {
		this.name = n;
		this.address = a;
		this.year = y;
		age = 10;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(year);
		out.writeInt(age);
		out.writeObject(address);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		year = in.readInt();
		age = in.readInt();
//		address = (String) in.readObject();
	}

	@Override
	public String toString() {
		return ("Name: " + name + "\n" + "Year: " + year + "\n" + "Age: " + age + " and Address " + address);
	}

}

public class ExternalizationExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Bullet", 1996, "Kurha");
		Vehicle newvehicle = null;
//		Vehicle newvehicle = new Vehicle("Ducati", 2022, "Pune");

		// Serialize the car
		try {
			FileOutputStream fo = new FileOutputStream("gfg.txt");
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(vehicle);
			so.flush();
		} catch (Exception e) {
			System.out.println(e);
		}

		// Deserialization the car
		try {
			FileInputStream fi = new FileInputStream("gfg.txt");
			ObjectInputStream si = new ObjectInputStream(fi);
			newvehicle = (Vehicle) si.readObject();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("                      ");
		System.out.println("The original vehicle is:\n" + vehicle);
		System.out.println("                      ");
		System.out.println("The new vehicle is:\n" + newvehicle);

	}

}
