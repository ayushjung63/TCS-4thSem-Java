package scope;

public class Student {
    private String name;
    static String college="TCS College";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void hello(){
        System.out.println("Hello I am static method");
    }

    public static void main(String[] args) {
//

        Student s1=new Student();
        s1.setName("Ram");
        System.out.println(s1.name);
        System.out.println(Student.college);
        Student.hello();
    }
}
