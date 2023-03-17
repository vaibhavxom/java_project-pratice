package com.mile1.bean;

public class Student {
	String name;
	int marks[];
	String grades;
	
	public Student(){
		
	}
	public Student(String grades,int[]marks,String name)
	{
		this.name = name;
		this.marks = marks;
		this.grades = grades;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
}
