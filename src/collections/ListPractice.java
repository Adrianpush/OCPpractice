package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        String[] names = {"Ed", "Edd", "Eddy"};
        List<String> listNames = Arrays.asList(names);
        listNames.set(1, "Eddd");
        System.out.println(listNames);

        List<String> animals = new ArrayList<>();
        System.out.println(animals.add("Elephant"));
        System.out.println(animals.remove("Elephant"));
        System.out.println(animals.remove("Elephant"));
        System.out.println(animals.add("Sparrow"));
        System.out.println(animals.remove(0));

        List<String> birds = new LinkedList<>();
        birds.add("Sparrow");

    }
}
