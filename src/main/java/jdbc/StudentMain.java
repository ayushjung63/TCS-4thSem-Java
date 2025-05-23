package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentMain {

    // mysql
    //             jdbc:mysql://{dbHostName}:{dbPort}/{databaseName}
    static String DB_URL="jdbc:mysql://localhost:3306/my_test_db";

    // postgres
    // String DB_URL = "jdbc:postgresql://localhost:5432/my_test_db";

    static String USER="root";
    static String PASSWORD="root";


    public static void main(String[] args) {
        Student student = new Student(1,"Ram","IT","4th Semester");

        try {
            //postgres
            //Class.forName("org.postgresql.Driver");

            // mysql
            // registering the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // getting the connection
            Connection connection=DriverManager.getConnection(DB_URL,USER,PASSWORD);
            String selectSql="SELECT * FROM student";

            // creating the statement
            Statement statement = connection.createStatement();

            // executing statement and getting resultSet
            ResultSet resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String faculty = resultSet.getString("faculty");
                String semester = resultSet.getString("semester");
                System.out.println("<" + id + " " + name + " " + faculty + " " + semester + ">");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
