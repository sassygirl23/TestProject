package exceptions;

// Number subclasses and allowed
class Calculator<T extends Number> {

    public double square(T value) {

        return value.doubleValue()
                * value.doubleValue();
    }
}

public class Bounded {

    public static void main(String[] args) {

        Calculator<Integer> calc =
                new Calculator<>();

        System.out.println(
                calc.square(5));
    }
}