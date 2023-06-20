package com.demo.classloading;

/*This program is compiled and run in Java 1.8
 * Using Class Loader here we load Classes Student and Semester
 * from the same package of this class, and printing the respective class names. */
public class MainMethod {

	public static void main(String[] args) {
		

		ClassLoader classLoader = MainMethod.class.getClassLoader();
		
		 try {
		        Class aClass = classLoader.loadClass("com.demo.classloading.Semester");
		        Class bClass = classLoader.loadClass("com.demo.classloading.Student");
		        System.out.println("The Class Name  = " + aClass.getName());
		        System.out.println("The Class Name  = " + bClass.getName());
		 }
		 catch (ClassNotFoundException e) 
		 {
		        e.printStackTrace();
		 }
	}

}
