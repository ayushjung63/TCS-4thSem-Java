package acessmodifier.ex1;

public class Person {
    public String name;
    private int salary;

    // if no access modifier is addded, it is default
    int age;

    protected int contact;


    public void print(){
        System.out.println("Salary: " + salary);
    }
}
