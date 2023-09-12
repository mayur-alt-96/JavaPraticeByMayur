package com.capita.comparable;

import java.util.Comparator;

public class ChildernSortBasedOnName implements Comparator<Childern> {

	@Override
	public int compare(Childern o1, Childern o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
