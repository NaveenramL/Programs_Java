package com.demo.utilPackageProgramsComparator;

import java.util.Comparator;

public class SortByEmployeeName implements Comparator<Employee>{
	
	public int compare(Employee empObj1,Employee empObj2) {
		return empObj1.name.compareTo(empObj2.name);
	}

}
