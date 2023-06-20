package com.demo.interfaces;

public class Laptop implements CPU{

	public int ramMemeorySize;
	public int graphicsCardSize;
	public static String laptopName = "Sony";
	
	public void ramMemory(int size) {
		this.ramMemeorySize=size;
	}
	
	public void graphicsCard(int size) {
		this.graphicsCardSize=size;
	}
	
	public void details() {
		System.out.println("This "+laptopName+" laptop specifications are "+
				this.ramMemeorySize+" GB RAM memory and "+
				this.graphicsCardSize+" GB of Graphics Card size.");
	}

	
}
