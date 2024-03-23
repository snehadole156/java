package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCService {

	private static Connection connection;
	private static PreparedStatement preparedStatement;
	private static ResultSet resultSet;
	private static String query;
	
	private static void  openConnection() throws SQLException {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja","root","root");
	}
	private static void closeConnection() throws SQLException {
		if(connection!=null) {
			connection.close();
		}
		if(preparedStatement!=null) {
			preparedStatement.close();
		}
		if(resultSet!=null) {
			resultSet.close();
		}
	}
	private static void signIn(Scanner scanner)
	{
		System.out.println("Enetr user id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("enetr user name");
		String name = scanner.nextLine();
		System.out.println("enter user email ");
		String email = scanner.nextLine();
	    System.out.println("enter uesr password");
	    String password = scanner.nextLine();
	    
	    try {
			openConnection();
			query="INSERT INTO user WHERE (?,?,?,?)";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, password);
			int res = preparedStatement.executeUpdate();
			if(res==1) {
				System.out.println("signed up");
			}else {
				System.out.println("error");
			}
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
