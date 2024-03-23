package com.jspiders.jdbc.operations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCCall {

	private static CallableStatement callableStatement;
	private static String query;
	private static Connection connection;
	private static ResultSet resultSet;
	
	
	private static void openConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","root");
	}
	private static void closeConnectin() throws SQLException {
		if(callableStatement!=null) {
			callableStatement.close();
		}
		if(resultSet!=null) {
			resultSet.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}
	public static void main(String[] args) {
		
		try {
			openConnection();
			query="call sort()";
			callableStatement=connection.prepareCall(query);
			callableStatement.execute();
			resultSet=callableStatement.getResultSet();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnectin();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
