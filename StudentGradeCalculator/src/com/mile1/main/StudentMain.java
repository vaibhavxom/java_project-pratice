package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NoNameException;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	
	static Student Data[]= new Student[4];
	StudentMain()
	{
		
	}
	StudentMain(String s,int n,String g){
		for(int i =0;i<Data.length;i++) 
		{
			Data[i]=new Student();
		}
		
		Data [0] = new Student("sekar",new int[]{70,75,95},null);
		Data [1] = new Student(null,new int[]{70,75,95},"g");
		Data [2] = null;
		Data [3] = new Student("manoj",null,null);
	}
	public static void main(String[] args) {
	
		StudentReport sr = new StudentReport();
		StudentService ss =new StudentService();
		System.out.println("grade Calculation");
		
		String x = null;
		
		for(int i=0 ; i <Data.length;i++)
			{
				try {
					x = sr.validate(Data[i]);
				}
				catch (NoNameException ex) {
					x = "NullNameException ";
				}
				catch (NullMarksArrayException ex) {
					x = "NullMarksArrayException ";
				}
				catch (NullStudentObjectException ex) {
					x = "NullStudentObjectException ";
				}
				
				System.out.println("grade = " + x);
			}
		System.out.println("Number of object with the mark as null "+ ss.findNumberOfNullMarksArray(Data));
		System.out.println("Number of object with the name as null "+ ss.findNumberOfNullName(Data));
		System.out.println("Number of object with the object as null "+ ss.findNumberOfNullObjects(Data));
		
		
	}

}
