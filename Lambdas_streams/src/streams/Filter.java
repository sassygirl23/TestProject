package streams;

import java.util.List;

public class Filter {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(10, 15, 20, 25);

        numbers.stream()

                // kukunin lang ang > 15
                .filter(n -> n > 15)

                .forEach(System.out::println);

        
//filter() returns matching elements

    }
}