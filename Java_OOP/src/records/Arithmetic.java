package records;

public class Arithmetic  {

    static int divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException(
                    "Cannot divide " + a + " by zero."
            );
        }

        return a / b;
    }

    public static void main(String[] args) {

        System.out.println(divide(20, 5));
        System.out.println(divide(10, 0));
    }
}