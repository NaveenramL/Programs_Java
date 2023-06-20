package com.demo.javaReflectionAPI;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.demo.assignment.SampleProgram;

public class ReflectionAPIExample {
	
	
	public void givenObject_whenInvokePublicMethod_thenCorrect() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
	    Method sumInstanceMethod
	      = SampleProgram.class.getMethod("addition", int.class, int.class);

	    SampleProgram operationsInstance = new SampleProgram();
	    int result
	      = (int) sumInstanceMethod.invoke(operationsInstance, 1, 3);

	    System.out.println(result);
	}

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub

		  Class c = Class.forName("com.demo.assignment.SampleProgram");
//        Constructor array
        Constructor[] constructors = c.getDeclaredConstructors();
         
        for(Constructor constructor : constructors) {
            System.out.println("Name of Constructor : "+constructor);
         
            System.out.println("Count of constructor parameter : "+constructor.getParameterCount());
             
            Parameter[] parameters = constructor.getParameters();
            for(Parameter parameter : parameters) {
                System.out.println("Constructor's parameter : "+parameter);
            }
            System.out.println();
        }
        System.out.println();
//          Method Array
          Method[] methods = c.getDeclaredMethods();
          System.out.println("Length of method : "+methods.length);
       
        for(Method method : methods){
            System.out.println("Method name: \t"+method);
            System.out.println("Method return type : \t"+method.getReturnType());
            System.out.println("Method parameter count: \t"+method.getParameterCount());
            System.out.println();
            Parameter[] parameters = method.getParameters();
            for(Parameter parameter : parameters) {
                System.out.println("Method's Parameter : "+parameter);
            }
            System.out.println();
        }
        System.out.println();
//        Annotations
        Class[] classes = c.getDeclaredClasses();
        for(Class class1 : classes) {
            System.out.println("class: "+class1);
            System.out.println("Name of class: "+class1.getName());
        }
//        Annotations
        Annotation[] anno = c.getDeclaredAnnotations();
        for(Annotation annotation : anno) {
            System.out.println("Annotation: "+annotation);
        }
        
        ReflectionAPIExample robj = new ReflectionAPIExample();
        robj.givenObject_whenInvokePublicMethod_thenCorrect();
    }
	}


