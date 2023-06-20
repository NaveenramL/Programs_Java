package com.demo.utilPackageProgramsComparator;

import java.util.Comparator;

public class SortByEmployeeId implements Comparator<Employee>{

	public int compare(Employee empObj1,Employee empObj2) {
		return empObj1.employeeId - empObj2.employeeId;
	}
}
