package com.mayur.practice;

public class Number {

	public static void main(String[] args) {

		Number number = new Number();
		number.prime(7);

	}

	private void prime(int num) {

		int i, m = 0, flag = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println("The given number is not prime number " + num);
		} else {
			for (i = 2; i <= m - 1; i++) {
				if (num % i == 0) {
					System.out.println("The given number is not prime number " + num);
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("The given number is prime number " + num);

			}
		}
	}

}
