package com.capita;

class Colleges implements Cloneable {

	String subject1;

	String subject2;

	String subject3;

	public Colleges(String sub1, String sub2, String sub3) {

		this.subject1 = sub1;

		this.subject2 = sub2;

		this.subject3 = sub3;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class CStudent implements Cloneable {

	int id;

	String name;

	public Colleges course;

	public CStudent(int id, String name, Colleges course) {

		this.id = id;

		this.name = name;

		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		CStudent cStudent =(CStudent)super.clone();

		cStudent.course=(Colleges)course.clone();
		
				return cStudent;
	}
}

public class DeepCloning {

	public static void main(String[] args) {

		Colleges sciences = new Colleges("Physics", "Chemistry", "Biology");

		CStudent student1 = new CStudent(11, "Nilesh", sciences);

		CStudent student2 = null;

		try {
			student2 = (CStudent) student1.clone();

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		System.out.println(student1.course.subject3);

		student2.course.subject3 = "Maths";

		System.out.println(student1.course.subject3);
	}

}
