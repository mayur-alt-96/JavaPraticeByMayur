package com.capita.designPattern;

public class Phone {

	private final String brand;
	private final String processor;
	private final int warranty;
	private final String mobName;

	private Phone(PhoneBuilder builder) {
		this.brand = builder.brand;
		this.processor = builder.processor;
		this.warranty = builder.warranty;
		this.mobName = builder.mobName;

	}

	public String getBrand() {
		return brand;
	}

	public String getProcessor() {
		return processor;
	}

	public int getWarranty() {
		return warranty;
	}

	public String getMobName() {
		return mobName;
	}

	@Override
	public String toString() {
		return "Phone : " + this.brand + ", " + this.processor + ", " + this.warranty + ", " + this.mobName;
	}

	public static class PhoneBuilder {
		private String brand;
		private String processor;
		private int warranty;
		private String mobName;

		public PhoneBuilder(String brand, String mobName) {
			this.brand = brand;
			this.mobName = mobName;
		}

		public PhoneBuilder processor(String processor) {
			this.processor = processor;
			return this;
		}

		public PhoneBuilder warranty(int warranty) {
			this.warranty = warranty;
			return this;
		}

		public Phone build() {
			Phone phone = new Phone(this);
			return phone;
		}
	}
}
