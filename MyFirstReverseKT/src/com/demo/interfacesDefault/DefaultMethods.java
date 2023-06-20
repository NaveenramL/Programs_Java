package com.demo.interfacesDefault;

public interface DefaultMethods {

	default void display() {
		System.out.println("This is a default method in interface....");
	}
}
