package com.mayur.practice;

public class DuplicateString {

	public static void main(String[] args) {

		String str = "Great responsibility";
		int count;

		// Converts given string into character array
		char[] charArray = str.toCharArray();
		System.out.println("Duplicate characters in given string:");

		// Counts each character present in the string
		for (int i = 0; i < charArray.length; i++) {
			count = 1;
			for (int j = 0; j < charArray.length; j++) {
				if (charArray[i] == charArray[j] && charArray[i] != '0') {
					count++;
					charArray[j] = '0';
				}
			}
			if (count > 1 && charArray[i] != '0') {
				System.out.println(charArray[i]);
			}
		}
	}
}
