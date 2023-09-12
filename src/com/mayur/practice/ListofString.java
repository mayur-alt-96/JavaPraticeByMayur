package com.mayur.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListofString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Mayur", "Nilesh", "Mayur", "Mayur", "Neha");

//		List<String> collect = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(collect);

//		usingList(list);
//		usingSet(list);
		usingMap(list);
//		list(list);
	}

	private static void list(List<String> list) {

		List<String> arrayList = new ArrayList<>();

		for (String value : list) {
			if (!arrayList.contains(value)) {
				arrayList.add(value);
			}
		}
		System.out.println(arrayList);
	}

	private static void usingSet(List<String> list) {

		Set<String> usingSet = new HashSet<>();

		for (String value : list) {

			usingSet.add(value);
		}
		System.out.println("Using set: " + usingSet);
	}

	private static void usingList(List<String> list) {

		List<String> usingList = new ArrayList<>();

		for (String value : list) {
			if (!usingList.contains(value)) {
				usingList.add(value);
			}
		}
		System.out.println("Using list: " + usingList);
	}

	private static void usingMap(List<String> list) {
		// TODO Auto-generated method stub

		Map<String, String> usingmap = new HashMap<>();

		for (String value : list) {
			if (!usingmap.containsKey(value)) {
				usingmap.put(value, " ");
			}
		}
		for (Map.Entry<String, String> values : usingmap.entrySet()) {

			System.out.print(values.getKey() + " " + values.getValue());

		}
	}
}
