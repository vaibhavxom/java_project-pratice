package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NoNameException;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {
	public String findGrade(Student studentObject )
	{
		int [] marks = studentObject.getMarks();
		int marksSum = 0;
		for(int i=0; i< marks.length;i++ )
		{
			if(marks[i] <35)
			{
				return"f";
			}
			else 
			{	marksSum += marks[i];}	
		}
		if(marksSum <=150) return "d";
		else if(marksSum > 150 && marksSum<=200) return "c";
		else if(marksSum > 200 && marksSum<=250) return "b";
		else if(marksSum > 250 && marksSum<=300) return "a";
		
		return "d";
	}
	
	public String validate(Student s)
		throws NoNameException,NullMarksArrayException,NullStudentObjectException
	{
		if(s == null) {
			throw new NullStudentObjectException();
		}else {
			if(s.getName() == null) throw new NoNameException();
			if(s.getMarks()== null) throw new NullMarksArrayException();
		return findGrade(s);
		}
		
	}
}
