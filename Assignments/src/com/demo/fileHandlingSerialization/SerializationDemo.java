package com.demo.fileHandlingSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Customer c1 = new Customer();
		c1.setName("Naveenram");
		c1.setAge(26);
		c1.setAddress("Villupuram");
		c1.setSalary(30000.0f);
		
		String filePath = "c:\\users\\navee\\desktop\\serial_test.txt";
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
	    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(c1);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	    
	    FileInputStream fileInputStream = new FileInputStream(filePath);
	    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	    Customer readCustObj = (Customer) objectInputStream.readObject();
	    System.out.println(readCustObj.getName()+" , "+readCustObj.getAge()+" , "+
	                       readCustObj.getAddress()+" , "+readCustObj.getSalary());
	    objectInputStream.close(); 
	}

}
