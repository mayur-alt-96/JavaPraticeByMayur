package com.mayur.practice;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		
		int n1 = 0 , n2 = 1 , n3 , i, count =15 ;
//		System.out.println(n1 + " " + n2);
		System.out.println(n1);
		System.out.println(n2);
		
		for (i = 5; i < count ; ++i) {
			n3 = n1+ n2 ;
			System.out.println(n3);
			n1 = n2 ;
			n2 = n3 ;
		}
	}
}
