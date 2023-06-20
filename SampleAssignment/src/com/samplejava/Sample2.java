package com.samplejava;

public class Sample2 extends Thread
{
	private final Sample1 data;  
	
	public Sample2(Sample1 data)   
	{  
	this.data = data;         
	}  
	
	@Override  
	public void run()  
	{  
	
	int oldValue = data.getCounter();  
	System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
	data.increaseCounter();  
	
	int newValue = data.getCounter();  
	System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
	
	}  
}
