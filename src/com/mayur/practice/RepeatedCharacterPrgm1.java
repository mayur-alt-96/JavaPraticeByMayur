package com.mayur.practice;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacterPrgm1 {

	public static void main(String[] args) {

		repeatChar("Money Heist");
	}

	private static void repeatChar(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();

		for (char value : charArray) {

			if (Character.isAlphabetic(value)) {
				if (map.containsKey(value)) {
					map.put(value, map.get(value) + 0);
				} else {
					map.put(value, 1);
				}
			}
		}
		System.out.println(map);
	}
}
