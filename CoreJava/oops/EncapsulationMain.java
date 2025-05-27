package oops;

/*
* Encapsulation
*   -> binding of attribute and behaviour in class
*   -> data and information hiding
*
* Data Hiding
*   -> making the attributes private
*   -> providing a public getter and setter to access it
*
* Access Modifier
*   -> default, public, private, protected
* */


public class EncapsulationMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("John");
        System.out.println("Name :: "+ e1.getName());
    }
}
