package cz.sheesh;

import java.sql.*;

public class Main {
    public static void main(String args[]) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/knihy", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM knihy");

        while(resultSet.next()) {
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("filling"));
            System.out.println("/");
        }
        connection.close();
    }
}
