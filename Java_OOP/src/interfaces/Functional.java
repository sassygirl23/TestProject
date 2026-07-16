package interfaces;
//lipat ko nalang sa lambda project

// Functional interface is xactly ONE abstract method
@FunctionalInterface
interface Greeting {

    void sayHello();
}

public class Functional {

    public static void main(String[] args) {

        // Lambda expression
        Greeting g =
                () -> System.out.println("Hello Love Goodbye!");

        g.sayHello();

        //Functional interface ginagamit sa lambda expressions

    }
}