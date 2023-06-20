package com.demo.javaExamples;

public class Staff extends Student{

	private String staffName;
	private String departmentName;
	
	public String getStaffName() {
		return staffName;
	}
	
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	/* Here we cannot override the printDeatils() method
	 * from Student class because it is a final method in 
	 * Student class*/
	/*
	 * void printDetails() {
	 * 
	 * }
	 */
	 void printStaffDetails() {
		 System.out.println("The staff details are : "+this.getStaffName()+" "+this.getDepartmentName());
	 }
}
