package com.topic.expcetion;

class VaccineException extends Exception {

	public VaccineException(String messege) {
		super(messege);
	}

}

public class CustomizeExceptionPrgm {

	public static void main(String[] args) {
		CustomizeExceptionPrgm customizeExceptionPrgm = new CustomizeExceptionPrgm();
		vaccine(1);
	}

	private static void vaccine(int doses) {
		if (doses < 2) {
			try {
				throw new VaccineException("Candidate did not take both the doses.");

			} catch (VaccineException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Candidate can go to mall.");
		}
	}
}
