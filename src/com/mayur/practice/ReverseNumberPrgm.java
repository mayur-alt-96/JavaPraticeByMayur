package com.mayur.practice;

public class ReverseNumberPrgm {

	public static void main(String[] args) {

//		reverseNumberCheck(413);
		
		reverseNumber(021);
	}

	private static void reverseNumber(int num) {
		int original = num;
		int reverse = 0 ;
		while(num != 0) {
			int remainder = num %10;         //021%10=
			reverse=reverse*10+remainder;
			num = num/10;
		}
		if(original == reverse) {
			System.out.println("Reverse number is same");
		}else {
			System.out.println("Reverse number are not same");
		}
	}

	private static void reverseNumberCheck(int number) {

		int original = number;
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;         //414%10=4      41%10=1     4%10=4          //413%10=3    41%10=1    4%10=4
			reverse = reverse * 10 + remainder;  //0*10+4=4      4*10+1=41   41*10+4=414     //0*10+3=3    3*10+1=31  31*10+4=314
			number = number / 10;                //414/10=41     41/10=4     4/10=0          //413/10=41   41/10=4    4/10=0
		}

		if (original == reverse) {
			System.out.println("Given number and reverse are same");
		} else {
			System.out.println("Given number and reverse are not same");
		}

	}
}
