package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete {

	private static Statement statement;
	private static Connection connection;
	private static String query;
	
	
	private static void openConnection() throws SQLException {
		query="DELETE FROM user WHERE id=5";
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","root");
		statement=connection.createStatement();
		int res=statement.executeUpdate(query);
		System.out.println(res);
		
		
	}
	
	private static void closeConnection() throws SQLException {
		if(statement !=null) {
			statement.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
