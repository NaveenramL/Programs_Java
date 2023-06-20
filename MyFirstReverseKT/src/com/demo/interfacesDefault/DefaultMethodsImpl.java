package com.demo.interfacesDefault;

public class DefaultMethodsImpl implements DefaultMethods{

	public void display() {
		DefaultMethods.super.display();
		System.out.println("This is a overridden method of default method in interface...");
	}
}
