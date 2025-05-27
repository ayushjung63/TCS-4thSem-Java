public class Student {
    String name; //default value is null
    String faculty; //default value is null

    public void printFaculty(){
        System.out.println(name +" faculty is: " + faculty);
    }
    public Student(){}


    public Student(String name, String faculty) {
        this.name = name;
        this.faculty = faculty;
    }
}
