package com.topic.multithreading;

public class GarbageCollector {

	protected void finalize() {
		System.out.println("Object is GC");
	}

	public static void main(String[] args) {
		GarbageCollector garbageCollector = new GarbageCollector();
		GarbageCollector garbageCollector1 = new GarbageCollector();
		garbageCollector = null;
		garbageCollector1 = null;
		System.gc();
	}
}
