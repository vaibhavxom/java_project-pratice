package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerialize {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		
		Employee emp;
		
		FileInputStream fis = new FileInputStream("serial");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		emp= (Employee)ois.readObject();
		ois.close();
		System.out.println(emp);
	}

}
