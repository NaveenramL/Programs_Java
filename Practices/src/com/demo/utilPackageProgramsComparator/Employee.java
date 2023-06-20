package com.demo.utilPackageProgramsComparator;

public class Employee {

	int employeeId;
	String name;
	String city;
	
	public Employee(int employeeId,String name,String city) {
		this.employeeId=employeeId;
		this.name=name;
		this.city=city;
	}

	public String toString() {
		return this.employeeId+" "+this.name+" "+this.city;
	}
	
}
