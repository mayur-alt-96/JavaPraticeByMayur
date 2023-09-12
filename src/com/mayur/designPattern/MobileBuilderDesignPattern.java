package com.mayur.designPattern;

public class MobileBuilderDesignPattern {

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile.MobileBuilder("Apple").build();
		System.out.println(mobile1);

		Mobile mobile2 = new Mobile.MobileBuilder("Samsung").MobName("Galaxy").build();
		System.out.println(mobile2);
	
		Mobile mobile3 = new Mobile.MobileBuilder("MI").MobName("Note-12").setMobPrice(17500.50).build();
		System.out.println(mobile3);
	}
}
