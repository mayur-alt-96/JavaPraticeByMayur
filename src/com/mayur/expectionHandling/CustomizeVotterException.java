package com.mayur.expectionHandling;

class VoterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VoterException(String message) {
		super(message);
	}
}

public class CustomizeVotterException {

	public static void main(String[] args) {

		vottingCheck(17);
	}

	private static void vottingCheck(int votter)  {

		if (votter < 18) {
			try {
				throw new VoterException("Votter candidate not eligible for votting");
			} catch (VoterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Votter candidate are eligible for votting");
		}
	}
}
