package com.topic.expcetion;

class VaccineStatusExceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VaccineStatusExceptions(String massege) {
		super(massege);
	}
}

public class CustomizeException1 {

	public static void main(String[] args) {

		CustomizeException1 customizeException1 = new CustomizeException1();
		customizeException1.vaccineStatus(1);
	}

	private void vaccineStatus(int doses) {

		if (doses < 2) {
			try {
				throw new VaccineStatusExceptions("The candidate did not take both doses.");
			} catch (VaccineStatusExceptions e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Candidate can go to mall");
		}
	}
}
