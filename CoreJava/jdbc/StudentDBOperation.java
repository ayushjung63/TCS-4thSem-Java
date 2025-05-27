package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDBOperation {

    public void deleteStudent(Integer id){
        String sql = "delete from student where id=?";
    }

    public void updateStudentName(Integer id,String name) {
        String sql = "UPDATE student SET name= ? where id = ?";
        try{
            Connection connection = ConnectionFactory.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,id);
            preparedStatement.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void getAllStudent(){
        String selectSql="SELECT * FROM student";
        try {
            Connection connection = ConnectionFactory.getConnection();
            // creating the statement
            Statement statement = connection.createStatement();

            // executing statement and getting resultSet
            ResultSet resultSet = statement.executeQuery(selectSql);
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String faculty = resultSet.getString("faculty");
                String semester = resultSet.getString("semester");
                System.out.println("<" + id + " " + name + " " + faculty + " " + semester + ">");
            }
        }catch (Exception e){
            System.out.println("ERROR " + e.getCause());
            e.printStackTrace();
        }
    }
}
