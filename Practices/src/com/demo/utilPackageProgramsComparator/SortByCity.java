package com.demo.utilPackageProgramsComparator;

import java.util.Comparator;

public class SortByCity implements Comparator<Employee>{
	
	public int compare(Employee empObj1,Employee empObj2) {
		return empObj1.city.compareTo(empObj2.city);

}
}
