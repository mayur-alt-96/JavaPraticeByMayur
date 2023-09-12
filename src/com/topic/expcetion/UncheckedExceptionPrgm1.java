package com.topic.expcetion;

class Student {
	String Name;
	int Id;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}

class Employee {
	String name;
	int Id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}

public class UncheckedExceptionPrgm1 {
	public static void main(String[] args) {
//		artiMaticExceptionCheck(20, 10);
		nullPointerMethodCheck();

		// array holds similar type/datatype of data.
		arrayindexofboundcheck();
		nullpointerexceptioncheck();
	}

	private static void arrayindexofboundcheck() {
		int a[] = { 10, 20, 30, 40 };
		String stringArray[] = { "Nilesh", "Mayur", "chokte", "", "", "", "Sagar" };
		try {
				System.out.println("Third location of array " + a[3]);
			if (stringArray[8] != null) {
				System.out.println("First location of array " + stringArray[8]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	private static void artiMaticExceptionCheck(int nominator, int denominator) {
		try {
			int x = nominator / denominator;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void nullPointerMethodCheck() {
		String str = "Mayur Chokte";
		try {
			System.out.println(str.substring(7));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Student student = null;
		if (student != null) {
			System.out.println(student.getName());

		}
		System.out.println("Calling Mayur");
	}

	{

	}

	private static void nullpointerexceptioncheck() {
		String str1 = "Nilesh Chokte";
		try {
			System.out.println(str1.toUpperCase());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Employee emp = null;
		if (emp != null) {
			System.out.println(emp.getName());
		}
		System.out.println("Calling Nilesh");
	}
}
