package com.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.beans.Employee;
import com.dao.EmployeeDAO;

public class EmployeeService {

	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		
		Scanner sc = new Scanner(System.in);
	
		int eid;
		
		System.out.println("enter  employee id : ");
		
		eid = sc.nextInt();
		try {
		Employee emp = dao.getEmployee(eid);
		
		if(emp != null)
		{
			System.out.println("emp id = " + emp.getEid());
			System.out.println("emp name = " +emp.getEname());
			System.out.println("emp salaray =" + emp.getSalary());
		}
		else
		{
			System.out.println("employee Not found");
			
		}
		}
		catch(SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
		
		sc.close();

	}

}
