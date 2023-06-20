package com.constructorsample;

public class Company {

	int employeesCount;
	String department;
	
	public Company(int employeesCount) {
		this.employeesCount=employeesCount;
	}
	
	public Company(int employeesCount, String department) {
		this.employeesCount=employeesCount;
		this.department=department;
	}
	
	
	public void printDetails() {
		System.out.println("Number of Employees count = "+ employeesCount);
		System.out.println("Name of the department is : "+department);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company c1 = new Company(100);
		c1.printDetails();
		
		Company c2 = new Company(500, "Development");
		c2.printDetails();
	}

}
