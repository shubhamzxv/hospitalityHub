package test.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectorTest {
    private static final String URL = "jdbc:mysql://localhost/hospitality_management?serverTimezone=UTC";
    private static final String USER = "root"; // replace with your MySQL username
    private static final String PASSWORD = ""; // replace with your MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = getConnection()) {
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
