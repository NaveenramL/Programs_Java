package com.demo.samplequicksort;

public class MainMethod {

	public static void main(String[] args) {
		
			int[] num = {27, 23, 11, 7, 9, 17, 6};
			
			
			System.out.println("Unsorted array:");
			for(int i: num)
			{
			    System.out.print(i + " ");
			}
			
			
			QuickSort.quicksort(num, 0, num.length-1);
			
		
			System.out.println("\nSorted array:");
			for(int i: num)
			{
			    System.out.print(i + " ");
			}	
		}


}
