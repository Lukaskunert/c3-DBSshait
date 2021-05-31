package cz.sheesh;

import java.sql.*;

public class InsertExample {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/knihy", "root", "");

            String newname = "book";
            String newauthor = "author";
            String newfilling = "sheeesh";
            int newprice = 69;

        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO knihy VALUES(NULL, ?, ?, ?, ?);");
            preparedStatement.setString(1, newname);
            preparedStatement.setString(2, newauthor);
            preparedStatement.setString(3, newfilling);
            preparedStatement.setInt(4, newprice);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
    }

}
