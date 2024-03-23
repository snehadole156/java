package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsrt {

	public static void main(String[] args) throws SQLException {
		//load and register the driver
		Driver driver= new com.mysql.cj.jdbc.Driver();
		
		//open the connection
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
		
		//create the statement
		Statement statement=connection.createStatement();
		
		//Execute the statement
		statement.execute("INSERT INTO user VALUES(1,'sneha','sneha@gmail.com','sneha123')");
		
		//process the result
		System.out.println("data inserted");
		
		//close the connection
		connection.close();
		
		//deregistration the drive
		DriverManager.deregisterDriver(driver);
	}
}
