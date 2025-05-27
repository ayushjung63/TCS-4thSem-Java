package acessmodifier.ex1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="John";
//        person.salary=10000; // not accessible since private
        person.age=22;
        person.contact= 987654321;
    }
}
