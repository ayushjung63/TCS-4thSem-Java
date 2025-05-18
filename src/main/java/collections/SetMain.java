package collections;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();
        nameSet.add("John");
        nameSet.add("Jane");
        nameSet.add("Bob");

        System.out.println(nameSet);

        nameSet.add("John");
        System.out.println(nameSet);

        System.out.println(nameSet.size());
        for (String name : nameSet) {
            System.out.println(name);
        }

    }
}
