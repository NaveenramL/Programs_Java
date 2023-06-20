package com.destructorsample;

public class DestructorExample {

	int employeesCount;
	String department;
	
	DestructorExample(){
		employeesCount=100;
	}
	
	DestructorExample(int employeesCount,String department){
		this.employeesCount=employeesCount;
		this.department=department;
	}
	
	public void printDetails() {
		System.out.println("Number of Employees in the Company : "+employeesCount);
	    System.out.println("Name of the Department is : "+department);
	}
	
	
	public void finalize() {
		System.out.println("Destructor called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DestructorExample de1 = new DestructorExample();
	    de1.printDetails();
	    
	    DestructorExample de2 = new DestructorExample(500,"cloud");
	    de2.printDetails();
	    
	    de1=null;
	    System.gc();
	}

}
