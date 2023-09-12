package com.topic.collection;

import java.util.HashSet;
import java.util.Set;

public class Company {

	int companyId;
	String companyName;

	public Company(int companyId, String companyName) {
		this.companyId = companyId;
		this.companyName = companyName;
	}

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || obj.getClass() != this.getClass())
			return false;

		Company company = (Company) obj;
		return (company.companyName.equalsIgnoreCase(this.companyName) && company.companyId == this.companyId);

	}

	@Override
	public int hashCode() {
		return this.companyId;
	}

	public static void main(String[] args) {

		Company company = new Company(101, "AVI");
		Company company1 = new Company(101, "Avi");
		Company company2 = new Company(101, "Avi");
		Company company3 = new Company(101, "Avi");
//		Company company1 = new Company(102, "Capita");
//		Company company2 = new Company(103, "Altrimetrik");
//		Company company3 = new Company(104, "Sacan-IT");

		Set<Company> set = new HashSet<>();
		set.add(company);
		set.add(company1);
		set.add(company2);
		set.add(company3);
		System.out.println("The size of hashset is " + set.size());

		for (Company value : set) {
			System.out.println("The value is " + value);
		}
	}
	
	private void show() {
		System.out.println("calling");
	}
}
