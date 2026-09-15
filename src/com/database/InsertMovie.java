package com.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMovie {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/movies_DB";
        String username = "root";
        String password = "aakash7654";

        String sql = "INSERT INTO movies (id, title, genre) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Values to insert
            statement.setInt(1, 101);
//            statement.setString(2, "Batman");
            statement.setString(3, "Action");

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Movie inserted successfully.");
            }

        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        }
    }
}