package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {

	static Connection con ;
	static String url= "jdbc:Oracle:thin:@localhost:1521:ORCL";
	static String uname ="scott";
	static String pwd="tiger";
	
	public static Connection getConnection(){
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, uname, pwd);
		} 
		catch (ClassNotFoundException ex) {
			System.out.println(ex.getMessage());
		} 
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		return con;
	}
	
	
	
}
