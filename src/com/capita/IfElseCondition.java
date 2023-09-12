package com.capita;

//public class IfElseCondition {
//
//	public static void main(String[] args) {
//
//		IfElseCondition ifElseCondition = new IfElseCondition();
//
////		ifElseCondition.ageForVoting(18);
////
////		ifElseCondition.withdrawAmount(50);
//
//		ifElseCondition.checkingStudentIsPass(40, 50, 60, "Nilesh");
//
//		ifElseCondition.checkingMethod("Nilesh", 20);
//
//		ifElseCondition.printBankBalanace(150000);
//
//	}
//
//	private void printBankBalanace(int bankBalance) {
//		System.out.println("Your available balance is " + bankBalance);
//	}
//
//	private void checkingMethod(String name, int value) {
//		System.out.println("Customer name is " + name + " and values is " + value);
//	}
//
//	private void withdrawAmount(int money) {
//
//		if (money >= 100) {
//			System.out.println("we can withdraw");
//		} else {
//			System.out.println("You have to enter more than 100");
//		}
//
//	}
//
//	private void ageForVoting(int age) {
//
//		if (age >= 18) {
//			System.out 
//	private void checkingStudentIsPass(int mathMark, int englishMark, int marathiMark, String name) {
//		if (mathMark >= 40) {
//			if (englishMark >= 40) {
//				if (marathiMark >= 40) {
//					System.out.println(name + " Pass");
//				}
//			}
//		} else {
//			System.out.println("Student failed.");
//		}
//
//		
//	}
//
//}

public class IfElseCondition {
	public static void main(String[] args) {
		IfElseCondition ifElseCondition = new IfElseCondition();
//		ifElseCondition.printBankBalanc(10000);
//		ifElseCondition.CheckingMethod("Mayur", 30000);
//		ifElseCondition.WithdrawAmount(150);
		ifElseCondition.ageForVoting(20);
		ifElseCondition.checkingsStudentIsPass(70, 60, 50, "Mayur");
	}

//	private void printBankBalanc(int bankbalance) {
//		System.out.println("Your available balance is " + bankbalance);
//	}
//
//	private void CheckingMethod(String name, int value) {
//		System.out.println("Customer name is " + name + " and value is " + value);
//	}
//
//	private void WithdrawAmount(int money) {
//		if (money >= 100) {
//			System.out.println("We can withdraw");
//		} else {
//			System.out.println("You have to enter more than 100");
//		}
//	}

	private void ageForVoting(int age) {
		if (age >= 18) {
			System.out.println("He can vote");
		} else {
			System.out.println("Not Eligible for vote");
		}
	}

	private void checkingsStudentIsPass(int englishMark, int mathMark, int marathiMark, String name) {
		if (englishMark >= 40) {
			if (mathMark >= 40) {
				if (marathiMark >= 40) {
					System.out.println("Student is Pass");
				}
			}
		} else {
			System.out.println("Student is Failed");
		}
	}
}
