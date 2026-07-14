package streams;

import java.util.List;

public class Count {

    public static void main(String[] args) {

        long count =
                List.of(1,2,3,4,5,11,15,18,22,25)

                        .stream()

                        .count();

        System.out.println(count);

//count() counts elements

    }
}