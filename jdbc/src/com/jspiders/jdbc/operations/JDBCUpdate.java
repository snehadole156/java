package com.jspiders.jdbc.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUpdate {

	private static Connection connection;
	private static Statement statement;
	private static String query;
	
	private static void oprnConnection() throws SQLException, IOException {
		File file=new File("E:\\Pictures\\db_info.txt");
		FileReader fileReader=new FileReader(file);
		Properties properties=new Properties();
		properties.load(fileReader);
		connection=DriverManager.getConnection(properties.getProperty("url"), properties);
	}
	private static void closeConnection() throws SQLException {
		if(statement !=null) {
			statement.close();
		}
		if(connection !=null) {
			connection.close();
		}
	}
	public static void main(String[] args) throws SQLException {
		try {
			oprnConnection();
			statement= connection.createStatement();
			query="UPDATE user SET password='Rutika@456'WHERE id=4 ";
			statement.execute(query);
			System.out.println("Password update");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection();
		}
	}
}
