package com.capita;

//public class CollegesPrgm {
//	public static void main(String[] args) {
//		System.out.println("Students has selected below this colleges");
//		CollegesPrgm collegesPrgm = new CollegesPrgm();
//		collegesPrgm.govtmentCollege();
//		collegesPrgm.godeCollege();
//		collegesPrgm.poteCollege();
//		collegesPrgm.raisoniCollege();
//	}
//	private void poteCollege() {
//		System.out.println("Pote College of engg ");
//	}
//
//	private void godeCollege() {
//		System.out.println("Gode College of engg");
//	}
//
//	private void raisoniCollege() {
//		System.out.println("Raisoni College of engg");
//	}
//
//	private void govtmentCollege() {
//		System.out.println("Government College of engg");
//	}
//}

public class CollegesPrgm {
	public static void main(String[] args) {
		System.out.println("Student has selected  below this colleges.");
		CollegesPrgm collegesPrgm = new CollegesPrgm();
		collegesPrgm.PoteCollege();
		collegesPrgm.GodeCollege();
		collegesPrgm.RaisoniCollege();
		collegesPrgm.PotGovernmentCollege();
	}

	private void PoteCollege() {
		System.out.println("Pote College of engg.");
	}

	private void GodeCollege() {
		System.out.println("Gode College of engg.");

	}

	private void RaisoniCollege() {
		System.out.println("Raisoni College of engg.");

	}

	private void PotGovernmentCollege() {
		System.out.println("Government College of engg.");

	}
}
