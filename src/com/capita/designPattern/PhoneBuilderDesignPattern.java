package com.capita.designPattern;

public class PhoneBuilderDesignPattern {

	public static void main(String[] args) {
		Phone phone1 = new Phone.PhoneBuilder("Apple", "Ipnone 13").warranty(2).processor("IOS").build();
		System.out.println(phone1);

//		Phone phone2 = new Phone.PhoneBuilder("Vivo", "vivo 13").warranty(1).processor("android").build();
//		System.out.println(phone2);
//
//		Phone phone3 = new Phone.PhoneBuilder("Oppo", "Oppo 13").warranty(1).processor("android one").build();
//		System.out.println(phone3);
//
//		Phone phone4 = new Phone.PhoneBuilder("Samsung", "Galaxy 13").warranty(2).build();
//		System.out.println(phone4);
	}
}
