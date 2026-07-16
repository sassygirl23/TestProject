package Lambda;


interface Calculator {

    void add(int a, int b, int c);
}

public class Parameter {

    public static void main(String[] args) {

        Calculator calc =
                (a, b, c) -> System.out.println(a + b + c);

        calc.add(5, 10, 8);
    }
}