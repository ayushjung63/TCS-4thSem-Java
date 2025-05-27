package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentMain {

    public static void main(String[] args) {
       StudentDBOperation studentDBOperation=new StudentDBOperation();
       studentDBOperation.getAllStudent();

        System.out.println("Updating....");
        studentDBOperation.updateStudentName(1,"Ram Bahadur");

        System.out.println("Print after update");
        studentDBOperation.getAllStudent();

    }
}
