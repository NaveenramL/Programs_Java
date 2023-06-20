package com.demo.javaExamples;

public class Student {

	private String studentName;
	private String departmentName;
	 
	 
	 
	 public String getDepartmentName() {
		return departmentName;
	}

      public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

       public String getStudentName() {
		return studentName;
	}

       public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

    
	final void printDetails() {
		 System.out.println("The student details are : "+this.getStudentName()+" "+this.departmentName);
	 }
	
	
	
}
