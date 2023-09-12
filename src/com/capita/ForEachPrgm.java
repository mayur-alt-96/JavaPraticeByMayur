package com.capita;

import java.util.Arrays;
import java.util.List;

public class ForEachPrgm {

	public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for (Integer values : list) {
			System.out.println(values);
		}
	}
}
