package com.capita.abstraction;

import com.capita.Constructors;

abstract class BankDetails {
	int id;
	String name;
	String address;

	public abstract void getHomeLoan();

	public abstract void getPersonalLoan();

	public abstract void getCarLoan();

	public abstract void getBikeloan();

	public abstract void getShopLoan();
	

	public void caronaPolicy() {
		System.out.println("10 Lacs insurance");
	}

	public BankDetails(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Calling  Parent ");

	}

	public BankDetails(int id, String name, String address) {
		this(id, name);
		System.out.println("Calling  Parent class constructor ");

	}
	
	public void show() {
		System.out.println("This is parent class method");
	}
}

interface RBIBanks {
	public void getrun();

	void caronaPolicy1();
}

class SBIBankDetails extends BankDetails implements RBIBanks {

//	public SBIBankDetails(int id, String name, String address) {
//		super(id, name, address);
//		System.out.println("Calling   class Constructor " + id + " and " + name + " and " + address);
//	}

public SBIBankDetails(int id, String name, String address) {
		super(id, name, address);
		// TODO Auto-generated constructor stub
		System.out.println("Calling SBI class Constructor " + id + " and " + name + " and " + address);
	}

	//	public SBIBankDetails() {
//		System.out.println("Calling  Child class Constructor");		
//	}
	@Override
	public void getHomeLoan() {
		System.out.println("this is home loan");
	}

	@Override
	public void getPersonalLoan() {
		System.out.println("this is personal loan");
	}

	@Override
	public void getCarLoan() {
		System.out.println("this is car loan");
	}

	@Override
	public void caronaPolicy() {
		System.out.println("15 Lacs insurance");
	}

	@Override
	public void getBikeloan() {
		System.out.println("Upto 1 Lacs");
	}

	@Override
	public void getShopLoan() {
		System.out.println("this is shop loan");

	}

	@Override
	public void getrun() {
		System.out.println("Run method");

	}

	@Override
	public void caronaPolicy1() {
		System.out.println("18 Lacs insurance");
	}

}

public class AbstractClassPrgm extends Constructors{

	public static void main(String[] args) {

		SBIBankDetails sbiBankDetails = new SBIBankDetails(10, "Mayur", "Pune");
//		sbiBankDetails.getHomeLoan();
//		sbiBankDetails.getPersonalLoan();
//		sbiBankDetails.getCarLoan();
//		sbiBankDetails.getBikeloan();
//		sbiBankDetails.caronaPolicy();
//		sbiBankDetails.getShopLoan();
//		sbiBankDetails.getrun();
//		sbiBankDetails.caronaPolicy1();
		sbiBankDetails.show();

		Constructors constructors = new Constructors();
		constructors.show();
	}

}
