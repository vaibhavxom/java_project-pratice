package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.beans.Employee;
import com.utils.DBConnection;

public class EmployeeDAO {
	
	public Employee getEmployee(int eid)throws SQLException {
		
		Connection con=DBConnection.getConnection();
		
		Employee emp = new Employee();
		
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery("select * from Employee where eid = "+ eid);
		
		if(rs.next())
		{
			emp.setEid(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setSalary(rs.getInt(3));
		}
		else
		{
			System.err.println("record not found");
		}
		rs.close();
		smt.close();
		con.close();
		
		
		return emp;
	} 
}
