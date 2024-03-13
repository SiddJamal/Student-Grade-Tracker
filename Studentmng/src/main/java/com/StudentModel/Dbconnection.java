package com.StudentModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	
	static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3307/studentsdb";
			
			String username="root";
			String password="ayan";
			
			System.out.println("connection sucessfully");
			
			Connection con=DriverManager.getConnection(url, username, password);
			return con;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
