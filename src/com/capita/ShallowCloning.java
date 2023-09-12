package com.capita;

class College {

	String subject1;
	String subject2;
	String subject3;
	String subject4;

	public College(String sub1, String sub2, String sub3, String sub4) {
		this.subject1 = sub1;
		this.subject2 = sub2;
		this.subject3 = sub3;
		this.subject4 = sub4;

	}
}

class CollegeStudent implements Cloneable {

	int id;
	String name;
	College course;

	public CollegeStudent(int id, String name, College course) {
		this.id = 5;
		this.name = "Nilesh";
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCloning {

	public static void main(String[] args) {

		College science = new College("Physics", "Chemistry", "Biology", "English");

		CollegeStudent student1 = new CollegeStudent(10, "Mayur", science);
		System.out.println(student1.id + " and " + student1.name);

		CollegeStudent student2 = null;

		try {
			student2 = (CollegeStudent) student1.clone();

		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		System.out.println(student1.course.subject2);	

		student2.course.subject2 = "English";

		System.out.println(student1.course.subject2);

		ShallowCloning shallowCloning = new ShallowCloning();

		shallowCloning.show(10, "Pune");
		shallowCloning.dispaly(1, "m", 10l);
	}

	private void dispaly(int id, String string, long l) { 

	}

	private void show(int i, String string) {
		string = "Amravati";
		System.out.println(i + " and " + string);
	}

}
