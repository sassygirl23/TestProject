package streams;

import java.util.List;

public class Reduce {

    public static void main(String[] args) {

        int sum =
                List.of(1,2,3,4)

                        .stream()

                        .reduce(
                                0,
                                (a,b) -> a + b);

        System.out.println(sum);


//reduce() combines values

    }
}