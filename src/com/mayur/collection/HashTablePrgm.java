package com.mayur.collection;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTablePrgm {

	public static void main(String[] args) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
//		hm.put(101, null);
		hm.put(null, "Rahul");

		for (Entry<Integer, String> map : hm.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
		
	}

}
