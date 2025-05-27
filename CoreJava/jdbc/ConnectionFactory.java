package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    // mysql
    //             jdbc:mysql://{dbHostName}:{dbPort}/{databaseName}
    static String DB_URL="jdbc:mysql://localhost:3306/my_test_db";

    // postgres
    // String DB_URL = "jdbc:postgresql://localhost:5432/my_test_db";

    static String USER="root";
    static String PASSWORD="root";

    public static Connection getConnection(){
        try {
            Connection connection= DriverManager.getConnection(DB_URL,USER,PASSWORD);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
