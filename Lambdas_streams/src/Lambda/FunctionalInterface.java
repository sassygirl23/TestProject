package Lambda;

// Functional Interface (Dapat exactly ONE abstract method lang)
interface Greeting {

    void sayHello();
}

public class FunctionalInterface {

    public static void main(String[] args) {

    
        Greeting greeting = () ->
                System.out.println("Hello Filipinas");

        greeting.sayHello();
    }
}