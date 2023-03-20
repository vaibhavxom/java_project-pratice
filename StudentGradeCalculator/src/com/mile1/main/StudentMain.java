package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NoNameException;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student Data[]= new Student[4];
	public StudentMain()
	{
		
	}
	
	public StudentMain(Student data[]) {
		
		StudentMain.Data = data;
		
		for(int i=0;i<data.length;i++)
		{
			data[i]=new Student();
		}
		
		data[0] = new Student("sekar", new int[]{85,50,95},"f");
		data[1] = new Student(null,new int[]{85,50,95}, null);
		data[2] = null;
		data[3] = new Student("manoj", null, null);
		
		
	}
	
	public static void main(String []args) {
		StudentReport sr = new StudentReport();
		StudentService ss = new StudentService();
		
		System.out.println("Grade Claculation");
		
		String x = null;
		
		for(int i= 0;i < Data.length;i++)
		{
			try {
				x = sr.validate(Data[i]);
			} catch (NoNameException e) {
				x = "no name exception occured";
			} catch(NullMarksArrayException e) {
				x = "null mark exception occured";
			} catch(NullStudentObjectException e){
				x = "null mark exception occured";
			}
			
			System.out.println("grade"+ x);
		}
		
		System.out.println("number of object with marks array as null = "+ ss.findNumberOfNullMarksArray(Data));
		System.out.println("number of object with no name as null = "+ ss.findNumberOfNullName(Data));
		System.out.println("number of object that are entirely  null = "+ ss.findNumberOfNullObjects(Data));
		
	}


}
