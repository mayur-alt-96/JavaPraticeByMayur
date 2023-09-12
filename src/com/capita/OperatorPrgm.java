package com.capita;

//public class OperatorPrgm {
//
//	public static void main(String[] args) {
//
//		OperatorPrgm operatorPrgm = new OperatorPrgm();
//
//		operatorPrgm.findStudentGrade(35);// marks which i got.
//
//		operatorPrgm.prefixAndPost();
//
//	}
//
//	private void prefixAndPost() {
//		int x = 10;
//		System.out.println(x++);// 10 (11)
//		System.out.println(++x);// 12
//		System.out.println(x--);// 12 (11)
//		System.out.println(--x);// 10
//		
//		int y = 20;
//		System.out.println(++y);  
//		System.out.println(y++);  
//		System.out.println(y++);  
//		System.out.println(++y);
//		
//		int z = 30;
//		System.out.println(z++);
//		System.out.println(z--);
//		System.out.println(++z);
//		System.out.println(z++);
//		
//	}
//
//	private void findStudentGrade(int marks) {
//
//		if (marks >= 60 && marks < 70) {
//			System.out.println("Student has C grade");
//		} else if (marks != 35) {
//			System.out.println("Boundry war pas zala potta.");
//		} else {
//			System.out.println("Student failed");
//		}
//
//	}
//}

// 35 != 35 - false
// 35 == 35 - true
// 

// and --> both condition  has to be true,
// but if first condition is false then it will not check second condition
// if first condition is true then it will check second one also.
// or --> one of both condition has to be true,
// but if first condition is true then it will not check second condition.
// if first condition is false it will check the second one.

//and 
//True true -> true
//false false - false
//true false - false
//false true - false

//or
//True true -> true  
//false false - false
//true false - false
//false true - false

public class OperatorPrgm {
	public static void main(String[] args) {
		OperatorPrgm operaterPrgm = new OperatorPrgm();
		//operaterPrgm.PrefixAndPostfix();
		operaterPrgm.FindStudentGrade(75);
	}

	private void PrefixAndPostfix() {
		int x = 99;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x++);
		System.out.println(--x);
		System.out.println(x--);

		int y = 101;
		System.out.println(y--);
		System.out.println(y--);
		System.out.println(++y);
		System.out.println(++y);
		System.out.println(y++);

		int z = 108;
		System.out.println(z++);
		System.out.println(z++);
		System.out.println(++z);
		System.out.println(++z);
		System.out.println(z--);
	}

	public void FindStudentGrade(int marks) {
		if (marks >= 60 && marks < 70) {
			System.out.println("Student has C Grade");
		}
		if (marks >= 70 && marks < 80) {
			System.out.println("Student has B Grade");
		}
		if (marks >= 80 && marks > 90) {
			System.out.println("Student has A Grade");
		} else if (marks != 35) {
			System.out.println("Student has pass on boundary");
		} else {
			System.out.println("Student has failed");
		}
	}
}