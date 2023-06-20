package com.demo.interfacesStatic;

public class MainMethod {

	public static void main(String[] args) {
		
		StaticInterface.print();
		StaticInterfaceImpl sObj = new StaticInterfaceImpl();
		sObj.print();

	}

}
