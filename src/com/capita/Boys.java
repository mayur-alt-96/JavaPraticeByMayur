package com.capita;

public class Boys implements Cloneable {

	int roll_no;
	String name;

	Boys(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {

		System.out.println("Calling boys");
		try {
			Boys boys = new Boys(07, "Mayur");
			Boys boys1 = (Boys) boys.clone();
			Boys boys2 = (Boys) boys.clone();

			System.out.println(boys.roll_no + " " + boys.name);
			System.out.println(boys1.roll_no + " " + boys1.roll_no);
			System.out.println(boys2.roll_no + " " + boys2.name);
			System.out.println(boys.hashCode());
			System.out.println(boys1.hashCode());
		} catch (CloneNotSupportedException c) {

		}
	}
}
