package collections;
/*
* List
*   1. ArrayList
*   2. LinkedList
* */

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");

        System.out.println(names.get(0));

        System.out.println(names.contains("Bob"));
        System.out.println(names.contains("Ram"));

        List<String> students = new ArrayList<>();
        students.add("Ram");
        students.add("Shyam");
        students.add("Bob");

        names.addAll(students);
        System.out.println(names);

    }
}
