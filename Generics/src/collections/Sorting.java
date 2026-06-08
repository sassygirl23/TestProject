package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Rica");
        names.add("Wang_U");
        names.add("Berto");

        // sort alphabetically
        Collections.sort(names);

        System.out.println(names);
    }
}