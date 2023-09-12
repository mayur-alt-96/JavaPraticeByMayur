package com.capita.comparable;

public class DaoExample {

	int id;

	public DaoExample(int id) {
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {

		DaoExample daoExample = new DaoExample(11);
//		daoExample.setId(15);

		daoExample.show();
	daoExample.display(200000000000L,20000000);
	}

	private void display(long salary, int id) {
//		salary = 20L;
		System.out.println(30L+ " and "+id);
	}

	private void show() {
		System.out.println("ID is " + id);
	}
}
