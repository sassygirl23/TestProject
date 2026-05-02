package methods;

public class Varargs {

    public static void main(String[] args) {
        printNumbers(1, 2, 3, 4);
    }

    static void printNumbers(int... nums) {
        for (int n : nums) {
            System.out.println(n);
        }
    }
}