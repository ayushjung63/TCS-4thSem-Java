package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentListMain {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ram","IT");
        Student s2=new Student(2,"Shyam","IT");
        Student s3=new Student(3,"Hari","IT");
        Student s4=new Student(4,"Gita","IT");

        List<Student> studentList=new LinkedList<>();;
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        for(Student student:studentList){
            System.out.println("Name:"+student.getName());
        }

        List<String> stringList=new ArrayList<>();
        stringList.add("John");
        stringList.add("Jane");
        stringList.add("Bob");

        for(String data:stringList){
            System.out.println(data);
        }
    }
}
