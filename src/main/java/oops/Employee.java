package oops;

public class Employee {
    // attributes
    private String name;
    private int salary;

    public Employee() {
    }

    // behaviour
    public void sayHello() {
        // implementation
        System.out.println("Hello from "+ name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
