package com.capita.abstraction;

interface Hospital {
	public void Ambulance();

	public void Bed();

	public void Oxygen();

	public void Doctor();
	
	void nurse();
}

public class SanjiviniHospital implements Hospital {

	@Override
	public void Ambulance() {
		System.out.println("Need to be Ambulance");
	}

	@Override
	public void Bed() {
		System.out.println("Need to be Bed ");

	}

	@Override
	public void Oxygen() {
		System.out.println("Need to be Oxygen");

	}

	@Override
	public void Doctor() {
		System.out.println("Need to be Doctor");

	}

	public static void main(String[] args) {
		SanjiviniHospital sanjiviniHospital = new SanjiviniHospital();
		sanjiviniHospital.Bed();
		sanjiviniHospital.Doctor();
		sanjiviniHospital.Oxygen();
		sanjiviniHospital.Ambulance();
		sanjiviniHospital.nurse();
		

	}

	@Override
	public void nurse() {
		System.out.println("Nurse to helping ");
	}

}
