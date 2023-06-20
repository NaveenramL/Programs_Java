package com.demo.fileHandlingWithCustomException;

import java.util.List;

public class Student {

	private String name;
    private List<Semester> semester;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Semester> getSemester() {
		return semester;
	}
	public void setSemester(List<Semester> semester) {
		this.semester = semester;
	}
    
    
}