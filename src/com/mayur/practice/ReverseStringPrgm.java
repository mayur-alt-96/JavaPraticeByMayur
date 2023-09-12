package com.mayur.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.sun.javafx.binding.StringFormatter;

public class ReverseStringPrgm {
	public static void main(String[] args) {

		String input = " Mayur Chokte";
//
//		char[] charArray= input.toCharArray();
//		for (int i = charArray.length - 1; i >= 0; i--);
//		System.out.println(charArray[i]);

		// Using String Builder
		StringBuilder input1 = new StringBuilder(input);
//		input1.append(input);
		input1.reverse();
		System.out.println(input1);

		// Using toCharArray
//		char[] charArray = input.toCharArray();
//
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.print(charArray[i]);
//		}

		// Using String Buffer
		String s1 = "Amravati Maharashtra";
		StringBuffer stringBuffer = new StringBuffer(s1);
		stringBuffer.reverse();
		System.out.println(stringBuffer);

		// Using Array List
//		String str = "Geeks For Geeks";
//		char[] charArray = str.toCharArray();
//		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.println(charArray[i]);
//		}

//		List<Object> list = new ArrayList<>();
//		for (char value : charArray) {
//			list.add(value);
//			Collections.reverse(list);
//			ListIterator iterator = list.listIterator();
//			while (iterator.hasNext()) {
//				System.out.print(iterator.next());
//			}

	}
}
