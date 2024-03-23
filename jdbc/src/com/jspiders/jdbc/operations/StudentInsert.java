package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInsert {

	private static Statement statement;
	private static Connection connection;
	private static Driver driver;
	private static String query;
	
	private static void openConnection() throws SQLException {
	    driver= new com.mysql.cj.jdbc.Driver();
	    DriverManager.registerDriver(driver);
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
	}
	private static void closeConnection() throws SQLException {
		if(statement!=null) {
			statement.close();
		}
		if(connection !=null) {
			connection.close();
			}

	}
	
	public static void main(String[] args) throws SQLException {
		try {
			openConnection();
			statement=connection.createStatement();
			query="INSERT INTO Student VALUES"+"(1,'Ramesh','Ramesh@gmail.com',34),"
                                    		  +"(2,'Suresh','Suresh@gmail.com',45),"
					                          +"(3,'Ganesh','Ganesh@gmail.com',31),"
                                    		  + "(4,'ajay','ajay@gmail.com',24),"
					                          +"(5,'Vijay','Vijay@gmail.com',34)";
			statement.execute(query);
			System.out.println("data is inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection();
		}
	}
}

