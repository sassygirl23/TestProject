package collections;

import java.util.HashSet;
import java.util.Set;

public class ExampleofSet {

    public static void main(String[] args) {

        // Set is walang duplicate values (bawal ulit ulit)
        Set<String> names = new HashSet<>();

        names.add("Rica");
        names.add("Bartolome");
        names.add("Rica");

        // duplicate Rica will be ignored
        System.out.println(names);
    }
}
//HashSet is nagtatangaal ng duplicates.