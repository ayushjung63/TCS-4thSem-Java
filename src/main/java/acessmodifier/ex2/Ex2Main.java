package acessmodifier.ex2;

import acessmodifier.ex1.Person;

public class Ex2Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John Doe";

        // not acccesible since they are in diff package
//        person.age=22;

        Child child = new Child();
        child.name = "Jane Doe";
//        child.contact=""
    }
}
