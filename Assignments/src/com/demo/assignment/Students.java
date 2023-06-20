package com.demo.assignment;

import java.util.List;

public class Students {

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