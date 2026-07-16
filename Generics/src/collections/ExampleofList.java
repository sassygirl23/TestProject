package collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleofList {

    public static void main(String[] args) {

        // List = ordered collection (pwede duplicate values)
        List<String> names = new ArrayList<>();

        // nag-a-add tayo ng elements dito
        names.add("Rica");
        names.add("Bert");
        names.add("Rica");

        // index starts at 0
        System.out.println(names.get(0));

        // ipprint buong list
        System.out.println(names);
    }
}
//List keeps insertion order and allows duplicates. Related ito sa Generics kasi List<String> means String lang ang accepted.