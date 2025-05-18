package streamapi;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListStreamMain {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        colors.stream()
                .map(color-> color.toUpperCase())
                .forEach(color-> System.out.println(color));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.println(num));
    }
}
