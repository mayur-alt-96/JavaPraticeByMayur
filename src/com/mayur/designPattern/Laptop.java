package com.mayur.designPattern;

public class Laptop {

	private final String lapBrand;
	private final String lapName;
	private final String lapProccessor;
	private final int lapWarranty;
	private final double lapPrice;

	private Laptop(LaptopBuilder builder) {
		this.lapBrand = builder.lapBrand;
		this.lapName = builder.lapName;
		this.lapProccessor = builder.lapProccessor;
		this.lapWarranty = builder.lapWarranty;
		this.lapPrice = builder.lapPrice;
	}

	public String getLapBrand() {
		return lapBrand;
	}

	public String getLapName() {
		return lapName;
	}

	public String getLapProccessor() {
		return lapProccessor;
	}

	public int getLapWarranty() {
		return lapWarranty;
	}

	public double getLapPrice() {
		return lapPrice;
	}

	@Override
	public String toString() {
		return "Laptop [lapBrand=" + lapBrand + ", lapName=" + lapName + ", lapProccessor=" + lapProccessor
				+ ", lapWarranty=" + lapWarranty + ", lapPrice=" + lapPrice + "]";
	}

	public static class LaptopBuilder {

		private final String lapBrand;
		private final String lapName;
		private String lapProccessor;
		private int lapWarranty;
		private double lapPrice;

		public LaptopBuilder(String lapBrand, String lapName) {
			this.lapBrand = lapBrand;
			this.lapName = lapName;
		}

		public LaptopBuilder lapProccessor(String lapproccessor) {
			this.lapProccessor = lapproccessor;
			return this;
		}

		public LaptopBuilder lapWarranty(int lapWarranty) {
			this.lapWarranty = lapWarranty;
			return this;
		}

		public LaptopBuilder lapPrice(double lapPrice) {
			this.lapPrice = lapPrice;
			return this;
		}

		public Laptop build() {
			Laptop laptop = new Laptop(this);
			return laptop;
		}
	}

}
