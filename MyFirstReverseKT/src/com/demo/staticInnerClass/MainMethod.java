package com.demo.staticInnerClass;

import com.demo.staticInnerClass.OuterClass.InnerClass;

public class MainMethod {

	public static void main(String[] args) {
		
		OuterClass.InnerClass obj = new OuterClass.InnerClass();
		obj.displayValue();
		
		OuterClass ocObj = new OuterClass();
		ocObj.display();

		InnerClass.print();
	}

}
