package com.mayur.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacterPrgm {
//	public static void main(String[] args) {
//		String str = "beautiful beach";
//		char[] charArray = str.toCharArray();
//		System.out.println("The string is : " + str);
//		System.out.println("Duplicate Characters in above string are: ");
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i + 1; j < str.length(); j++) {
//				if (charArray[i] == charArray[j]) {
//					System.out.print(charArray[i] + " ");
////					break;
//				}
//			}
//		}
//	}

//	public static void main(String[] args) {
//		String str = "Geeks for geeks";
//
//		String string = str.toLowerCase();
//
//		char[] charArray = string.toCharArray();
//
//		System.out.println("The String is : " + str);
//
//		System.out.println("Duplicate Characters in above String are : ");
//
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i + 1; j < str.length(); j++) {
//				if (charArray[i] == charArray[j]) {
//					System.out.print(charArray[j] + " ");
//				}
//			}
//		}
//	}

	public static void main(String[] args) {
		String str = "asdfasdfafk asd234asda";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();

		for (char value : arr) {

			if (Character.isAlphabetic(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value) + 1);

				} else {
					charMap.put(value, 1);
				}
			}
		}

		System.out.println(charMap);
	}
	
	
//	public static void main(String[] args) {
//        String aa = "Protijayi Gini jay";
//        String[] stringarray = aa.split("");
//
//    Map<String , Long> map =  Arrays.stream(stringarray)
//        .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
//        map.forEach( (k, v) -> System.out.println(k + " : "+ v)        );
//    }
}
