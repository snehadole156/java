package com.jspiders.jdbc.operations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallbaleJDbC {
	
	private static CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static String query;
    private static Connection connection;
    
	
	public static void openConnection() throws SQLException {
	connection=DriverManager.getConnection("JDBC:mysql://localhost:3306/weja4","root","root");	
	}
	public static void closeConnection() throws SQLException {
		if(callableStatement!=null) {
			callableStatement.close();
		}
		 
	}
	public static void main(String[] args) {
		
	}

}
