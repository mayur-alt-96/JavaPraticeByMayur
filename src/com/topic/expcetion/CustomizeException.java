package com.topic.expcetion;


class VaccineStatusException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VaccineStatusException(String message) {
		super(message);
	}
	
	public static void show() {
		System.out.println("Show method");
	}
}

public class CustomizeException {

	public static void main(String[] args) {

		vaccineStatus(2);
//		VaccineStatusException.show();
	}

	private static void vaccineStatus(int doses) {
		
		if(doses <2) {
			try {
				throw new VaccineStatusException("Candidate did not take both the doses.");
			} catch (VaccineStatusException e) {
				e.printStackTrace();
			}
	}else {
		System.out.println("Candidate can go to mall");
	}

//	private static void vaccineStatus(int doses) {
//
//		if (doses < 2) {
//			try {
//				throw new VaccineStatusException("candidate did not take both the doses.");
//			} catch (VaccineStatusException e) {
//				e.printStackTrace();
//			}
//		} else {
//			System.out.println("candidate can go to mall.");
//		}
	}

}

//class AgeException extends Exception {
//
//	public AgeException(String name) {
//		super(name);
//	}
//}
//
//class SBIBankException extends Exception {
//
//	public SBIBankException(String name) {
//		super(name);
//	}
//}
//
//class TicketException extends Exception {
//
//	public TicketException(String messege) {
//		super(messege);
//	}
//}
//
//public class CustomizeException {
//	// defining a method
//	public static void checkNum(int num) {
//		if (num < 1) {
//			throw new ArithmeticException("\\nNumber is negative, cannot calculate square");
//		} else {
//			System.out.println("Square of " + num + " is " + (num * num));
//		}
//	}
//
//	// main method
//	public static void main(String[] args) {
//		CustomizeException obj = new CustomizeException();
//		obj.checkNum(1);
//
//		System.out.println("Rest of the code..");
//
//		try {
//			obj.checkAge(17);
//		} catch (AgeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		try {
//			obj.bankBalance(2000);
//		} catch (SBIBankException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			obj.ticketCheck(59);
//		} catch (TicketException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	private void ticketCheck(int age) throws TicketException {
//		if (age < 60) {
//			throw new TicketException("Not eligible for half ticket");
//		} else {
//			System.out.println("Eligible for half ticket");
//		}
//	}
//
//	public void checkAge(int age) throws AgeException {
//		if (age < 18) {
//			throw new AgeException("Age is less than 18 so candidate can not vote.");
//		} else {
//			System.out.println("He can vote.");
//		}
//	}
//
//	public void bankBalance(double balance) throws SBIBankException {
//		if (balance < 2000) {
//			throw new SBIBankException("Your account has been deactivated");
//		} else {
//			System.out.println("Your account has been activated");
//		}
//
//	}
//}