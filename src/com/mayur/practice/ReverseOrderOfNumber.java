 package com.mayur.practice;

public class ReverseOrderOfNumber {

	public static void main(String[] args) {

		reverseNumber(11);
	}

	private static void reverseNumber(int number) {

		int original =number;
		int reverse=0;
		while(number!=0) {
			int remainder = number %10;
			reverse = reverse*10+remainder;
			number = number/10;
	}if(original==reverse) {
		System.out.println("Same");
	}else {
		System.out.println("Not same");
	}

//	private static void reverseNumber(int number) {
//
//		int original = number;
//		int reverse = 0;
//		while (number != 0) { 
//			int remainder = number % 10;          //111%10=1    11%10=1    1%10=1
//			reverse = reverse * 10 + remainder;   //0*10+1=1    1*10+1=11  11*10+1=111
//			number = number / 10;                 //111/10=11   11/10=1    1/10=0
//		}
//		if (original == reverse) {
//			System.out.println("Given number and reverse number are same");
//		} else {
//			System.out.println("Given number and reverse number are not same");
//		}
	}

}
