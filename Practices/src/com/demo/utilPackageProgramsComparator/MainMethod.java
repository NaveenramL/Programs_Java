package com.demo.utilPackageProgramsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(1000,"Naveen","Villupuram"));
		arrayList.add(new Employee(1001,"Ram","Cuddalore"));
		arrayList.add(new Employee(1002,"Raja","Chennai"));
		arrayList.add(new Employee(1003,"Shashank","Adayar"));
		arrayList.add(new Employee(1004,"Yuvaraj","Nemur"));
		
		for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
		System.out.println("----------------");
		Collections.sort(arrayList, new SortByEmployeeId());
		
		for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
		System.out.println("----------------");
		Collections.sort(arrayList, new SortByEmployeeName());
		for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
		System.out.println("----------------");
		
		Collections.sort(arrayList, new SortByCity());
		for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
		
		//Collections.sort(arrayList, Comparator.comparing(Employee::getName).reversed());
	}

}
