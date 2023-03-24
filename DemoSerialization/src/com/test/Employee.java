package com.test;

import java.io.Serializable;

public class Employee implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	int eid;
	String ename;
	transient int salary;
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	

}
