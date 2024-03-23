package com.jspiders.jdbc.operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert3 {

	private static PreparedStatement preparedStatement;
	private static Connection connection;
	private static String query;
	
	private static void openConnectin() throws SQLException {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4","root","root");
	}
	private static void closeConnection() throws SQLException {
		if(preparedStatement!=null)
		{
			preparedStatement.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}
	public static void main(String[] args) {
		try {
			openConnectin();
			query="INSERT INTO user VALUES(?,?,?,?)";
			Scanner scanner=new Scanner(System.in);
			preparedStatement=connection.prepareStatement(query);
			System.out.println("how many records you want to insert");
			int count=scanner.nextInt();
			for(int i=1;i<=count;i++) {
				System.out.println("enter the id");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("enter the name");
				String name = scanner.nextLine();
				System.out.println("enter the email");
				String email = scanner.nextLine();
				System.out.println("enter thye password");
				String password = scanner.nextLine();
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setString(3, email);
				preparedStatement.setString(4, password);
				preparedStatement.addBatch();
			}
			int[] res = preparedStatement.executeBatch();
			System.out.println(res+"row(s) affected");
			System.out.println(res);
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
