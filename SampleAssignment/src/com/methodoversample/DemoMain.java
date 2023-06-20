package com.methodoversample;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.print();
		
		SalesPerson sp1 = new SalesPerson();
		sp1.print();
		
		e1=sp1;
		e1.print();
		
		/*
		 * sp1=e1; sp1.print();
		 */

	}

}
