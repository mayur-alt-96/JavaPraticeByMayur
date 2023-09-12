package com.topic.collection;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Childern {

	int id;
	String name;
	String address;

	public Childern(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Id is " + getId() + " ,Name is " + getName() + " and address is " + getAddress();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Childern childern = (Childern) obj;
		return (childern.name.equals(this.name) && childern.id == this.id && childern.address.equals(this.address));

	}

	@Override
	public int hashCode() {
		return this.id;
	}

	public static void main(String[] args) {

//		addingChildernSet();

		addingChildernMap();
	}

	private static void addingChildernMap() {
		Map<Childern, String> map = new LinkedHashMap<>();
		Childern childern = new Childern(10, "Mayur", "Kurha");
		Childern childern1 = new Childern(12, "Nilesh", "Pune");
		Childern childern2 = new Childern(11, "Nilesh", "Kurha");
		Childern childern3 = new Childern(10, "Mayur", "Kurha");
		Childern childern4 = new Childern(10, "Sagar", "Kurha");
		Childern childern5 = new Childern(13, "Sagar", "Amravati");
		
		map.put(childern, "Childern");
		map.put(childern1, "Childern1");
		map.put(childern2, "Childern2");
		map.put(childern3, "Childern3");
		map.put(childern4, "Childern4");
		map.put(childern5, "Childern5");
		
		for (Map.Entry<Childern, String> m : map.entrySet()) {
			System.out.println("Key is " + m.getKey() + " and Value is " + m.getValue());
		}
	}

	private static void addingChildernSet() {
		Childern childern = new Childern(10, "Mayur", "Kurha");
		Childern childern1 = new Childern(12, "Nilesh", "Pune");
		Childern childern2 = new Childern(11, "Nilesh", "Kurha");
		Childern childern3 = new Childern(10, "Mayur", "Kurha");
		Childern childern4 = new Childern(10, "Sagar", "Kurha");
		Childern childern5 = new Childern(13, "Sagar", "Amravati");

		HashSet<Object> set = new HashSet<>();
		set.add(childern);
		set.add(childern1);
		set.add(childern2);
		set.add(childern3);
		set.add(childern4);
		set.add(childern5);
		for (Object value : set) {
			System.out.println("The Size is " + value);
		}
	}

}
