package com.demo.inheritanceHierarchical;

public class MainMethod {

	public static void main(String[] args) {
		
		TCS tcsObj = new TCS();
		tcsObj.aboutTCS();
		tcsObj.aboutCompany();
		System.out.println("----------------");
		
		Voltas vObj = new Voltas();
		vObj.Company();
		vObj.aboutCompany();
		System.out.println("----------------");
		
		TataMotors mObj = new TataMotors();
		mObj.aboutTataMotors();
		mObj.aboutCompany();

	}

}
