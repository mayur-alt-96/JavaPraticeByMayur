package com.capita.comparable;

import java.util.Comparator;

public class ChildernSortBasedOnId implements Comparator<Childern> {

	@Override
	public int compare(Childern o1, Childern o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		}
		return 0;
	}

}
