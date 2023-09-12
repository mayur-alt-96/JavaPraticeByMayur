package com.capita.abstraction;

abstract class Examination {

	abstract void policeExam();

	abstract void rtoExam();

	public abstract void staffExam();

	public void show() {
		System.out.println("This is all Government Examination and Calling shows");
	}
	public Examination() {
		System.out.println("Calling parent Constructor");
	}
}

interface Test {
	public void display();
	abstract void get();
}

public class Exam extends Examination implements Test {

	@Override
	void policeExam() {
		System.out.println("This is Plice exam");
	}

	@Override
	void rtoExam() {
		System.out.println("This is RTO exam");
	}

	@Override
	public void staffExam() {
		System.out.println("This is Staff exam");
	}

	public static void main(String[] args) {
		Exam exam = new Exam();
		exam.policeExam();
		exam.staffExam();
		exam.rtoExam();
		exam.show();
		exam.display();
		exam.getMethod();
		exam.get();
		exam.show();
//		Examination test = new Exam();
//		test.show(); 
	}

	@Override
	public void display() {
		System.out.println("This is exam for pepole ");
	}
	
	public void getMethod() {
		System.out.println("Get method ");
	}
	@Override
	public void get() {
		System.out.println("Calling get");
	}
	@Override
	public void show() {
		System.out.println("Calling shows");
//		super.show();
	}
	public Exam() {
		System.out.println("Calling Constructor");
	}
	
}
