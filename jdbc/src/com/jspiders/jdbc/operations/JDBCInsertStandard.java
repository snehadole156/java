package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertStandard {

	private static Driver driver;
	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	
	public static void main(String[] args) throws SQLException   {
		
		try {
			openConnection();
			statement=connection.createStatement();
			query="INSERT INTO user VALUES(2,'sakshi','sakshi@gmail.com','sakshi123')";
			statement.execute(query);
			System.out.println("data is inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection();
		}
		
	}
	private static void openConnection() throws SQLException {
		driver =new com.mysql.cj.jdbc.Driver() ;
	    DriverManager.registerDriver(driver);
	    connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
	}
	private static void closeConnection() throws SQLException {
		if(statement !=null) {
			statement.close();
		}
		if(connection !=null) {
			connection.close();
		}
		
	}
	
}
