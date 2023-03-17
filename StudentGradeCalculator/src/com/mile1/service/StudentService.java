package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	
	public int findNumberOfNullMarksArray(Student s[]) 
	{
		int count=0;
		for(int i =0;i<s.length;i++)
		{
			try {
				s[i].getMarks();
			} catch (Exception e) {
				count++;
			}
		}
		return count;
	}
	
	public int findNumberOfNullName(Student s[]) 
	{
		int nCount=0;
		for(int i =0;i <s.length;i++)
		{
			try {
				s[i].getName();
			} catch (Exception e) {
				nCount++;
			}
		}
		return nCount;
		
	}
	
	public int findNumberOfNullObjects(Student s[])
	{
		int objCount=0;
		for(int i =0;i <s.length;i++)
		{
			if(s[i]==null) objCount++;;;
		}
		return objCount;
	
	}
}
