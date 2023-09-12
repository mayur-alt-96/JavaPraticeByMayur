package com.capita.designPattern;

public class UserBuilderDesignPattern {
	public static void main(String[] args) {
//		User user1 = new User.UserBuilder("Lokesh", "Gupta").age(30).phone("1234567").address("Fake address 1234")
//				.build();
//
//		System.out.println(user1);
//
//		User user2 = new User.UserBuilder("Jack", "Reacher").age(40).phone("5655")
//				// no address
//				.build();
//
//		System.out.println(user2);
//
//		User user3 = new User.UserBuilder("Super", "Man")
//				// No age
//				// No phone
//				// no address
//				.build();
//
//		System.out.println(user3);
//
//		User user4 = new User.UserBuilder("NIlesh", "Chokte").age(15).phone("9595185073").address("Kurha").build();
//		System.out.println(user4);

		User user5 = new User.UserBuilder("Mayur", "Chokte").setAddress1("abc").build();

		System.out.println(user5);

	}
}
