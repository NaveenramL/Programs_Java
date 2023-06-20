package com.demo.accessmodifiers;

public class College {

	        /*it is default and can be only accesses within the package.*/
	          String collegeName = "SSEC"; 
	       /*for this please refer Student class within this package*/   
 
	          
	/*it can be accessed within and outside the package only by inheritance concept (or) by its child classes*/
	protected String departmentName = "ECE"; 
	/*for this please refer Staffs class in default package*/
	                                         
}
