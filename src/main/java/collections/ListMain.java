package collections;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors.get(0));
    }
}
