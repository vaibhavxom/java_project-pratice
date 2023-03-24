package com.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {
	
	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(10, "xyz", 25000);
		
		System.out.println(emp);
		
		FileOutputStream fos= new FileOutputStream("serial");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		
	}
}
