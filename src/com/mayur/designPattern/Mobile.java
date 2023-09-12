package com.mayur.designPattern;

public class Mobile {

	private final String mobBrand;
	private final String mobName;
	private final double mobPrice;

	public Mobile(MobileBuilder builder) {
		this.mobBrand = builder.mobBrand;
		this.mobName = builder.mobName;
		this.mobPrice = builder.mobPrice;
	}

	public String getMobBrand() {
		return mobBrand;
	}

	public String getMobName() {
		return mobName;
	}

	public double getMobPrice() {
		return mobPrice;
	}

	@Override
	public String toString() {
		return "Mobile [mobBrand=" + mobBrand + ", mobName=" + mobName + ", mobPrice=" + mobPrice + "]";
	}

	public static class MobileBuilder {

		private final String mobBrand;
		private String mobName ="Not mentioned" ;
		private double mobPrice=0.0;

		public MobileBuilder(String mobBrand) {
			this.mobBrand = mobBrand;
		}

		public MobileBuilder MobName(String mobName) {
			this.mobName = mobName;
			return this;
		}

		public MobileBuilder setMobPrice(double mobPrice) {
			this.mobPrice = mobPrice;
			return this;
		}

		public Mobile build() {
			Mobile mobile = new Mobile(this);
			return mobile;
		}

	}

}
