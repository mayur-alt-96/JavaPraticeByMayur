package com.capita.designPattern;

public class User {
	// All final attributes
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
	private final String address1; // optional

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
		this.address1 = builder.address1;
	}

	// All getter, and NO setter to provide immutability
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	public String getAddress1() {
		return address1;
	}

	@Override
	public String toString() {
		return "User: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", "
				+ this.address+" , "+ this.address1;
	}

	public static class UserBuilder {
		private final String firstName;
		private final String lastName;
		private int age;
		private String phone;
		private String address;
		private String address1;

		public UserBuilder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public UserBuilder setAddress1(String address1) {
			this.address1 = address1;
			return this;
		}

		// Return the finally consrcuted User object
		public User build() {
			User user = new User(this);
			return user;
		}

			// if user object does not break any assumption of system
		}
	}
