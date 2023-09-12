package com.oopsConcept.Inheritance;

abstract class CompanyPrgm {

	public abstract void Helmet();

	public abstract void Safetyshoes();

	public abstract void Safetysuits();

	public abstract void handgloves();
	
	public CompanyPrgm(int x) {
System.out.println("Company rate is "+ x);
	}

}

public class BMCGroup extends CompanyPrgm {

	public BMCGroup(int x) {
		super(x);
//		System.out.println("BMC Company rate is "+ x);
	}

	@Override
	public void Helmet() {
		System.out.println("use for head");
	}

	@Override
	public void Safetyshoes() {
		System.out.println("use for legs");
	}

	@Override
	public void Safetysuits() {
		System.out.println("use for body");
	}

	@Override
	public void handgloves() {
		System.out.println("use for hand");
	}
	
	public static void show() {
		System.out.println("The show method");
	}

	public static void main(String[] args) {
		CompanyPrgm bmcGroup = new BMCGroup(10);
		bmcGroup.Helmet();
		bmcGroup.Safetyshoes();
		bmcGroup.Safetysuits();
		bmcGroup.handgloves();
		BMCGroup.show();
	}

}
