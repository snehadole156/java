package com.jspiders.jdbc.operations;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class student2 {

    private static Statement statement;
    private static Connection connection;
    private static Driver driver;
    private static String query;

    private static void openConnection() throws SQLException {
        driver = new com.mysql.cj.jdbc.Driver();
        DriverManager.registerDriver(driver);
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weja4?user=root&&password=root");
    }

    private static void closeConnection() throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public static void main(String[] args) throws SQLException {
        try {
            openConnection();
            statement = connection.createStatement();
            // Modify the query to select records whose name contains "jay"
            query = "SELECT * FROM Student WHERE name LIKE '%jay%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("Age: " + resultSet.getInt("age"));
                System.out.println("------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
    }
}
