package streamapi;

/*
* Create a Employye class with id, name and salary
* create 5 employee and add them to list
*
* filter employee with salary greater then 20000 and print them
* */

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"John",2000);
        Employee e2=new Employee(2,"Ram",25000);
        Employee e3=new Employee(3,"Shyam",35000);
        Employee e5=new Employee(4,"Hari",30000);
        Employee e4=new Employee(5,"Gita",5000);

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        employeeList.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .forEach(employee -> System.out.println(employee));
    }
}
