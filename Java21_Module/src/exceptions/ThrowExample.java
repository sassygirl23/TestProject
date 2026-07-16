package exceptions;

public class ThrowExample {

    public static void checkAge(int age) {

        // throw = manually create exception
        if (age < 18) {

            throw new IllegalArgumentException(
                    "Age must be 18 or above");
        }

        System.out.println("Access granted");
    }

    public static void main(String [] args) {

        checkAge(20);
    }
}