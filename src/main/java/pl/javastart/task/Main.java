package pl.javastart.task;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // tutaj możesz przeprowadzać manualne testy listy

        // lista powinna być parametryzowana (analogicznie jak java.util.ArrayList czy java.util.LinkedList)
        CustomList<String> customListOfStrings = new CustomList<>();
        CustomList<Integer> customListOfIntegers = new CustomList<>();

        customListOfStrings.add("Ania");
        customListOfStrings.add("Kasia");
        customListOfStrings.add("Wojtek");
        customListOfStrings.add("Tomek");

        System.out.println(customListOfStrings);
        System.out.println(customListOfStrings.get(2));
        System.out.println(customListOfStrings.size());
        customListOfStrings.add(3, "Iza");
        System.out.println(customListOfStrings);
        customListOfStrings.remove(5);
        System.out.println(customListOfStrings);

        customListOfIntegers.add(1);
        customListOfIntegers.add(2);
        customListOfIntegers.add(3);
        customListOfIntegers.add(4);

        System.out.println(customListOfIntegers);
        System.out.println(customListOfIntegers.get(2));
        System.out.println(customListOfIntegers.size());
        customListOfIntegers.add(3, 10);
        System.out.println(customListOfIntegers);
        customListOfIntegers.remove(0);
        System.out.println(customListOfIntegers);
    }
}
