package Lambda;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {

        // Predicate returns boolean
        Predicate<Integer> isAdult =
                age -> age >= 18;

        System.out.println(
                isAdult.test(20));

        System.out.println(
                isAdult.test(15));
        
        System.out.println(
                isAdult.test(100));
    }
}