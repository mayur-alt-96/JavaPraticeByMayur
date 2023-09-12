package com.capita.comparable;

import java.util.Comparator;

public class ChildernSortBasedOnAddress implements Comparator<Childern> {

	@Override
	public int compare(Childern o1, Childern o2) {
		return o1.getAddress().compareTo(o2.getAddress());
	}

}
