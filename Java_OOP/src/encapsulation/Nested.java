package encapsulation;

public class Nested {

    // Field ng outer class
    private String message =
            "Hello, please wait for me <3";

    // Inner class
    class InnerClass {

    	void display() {

            // Kayang i-access ng inner class ang private members ng outer class
            System.out.println(message);
        }
    }

    public static void main(String[] args) {

        // Gumagawa outer object
        Nested outer =
                new Nested();

        // Syntax para gumawa inner object
        Nested.InnerClass inner =
                outer.new InnerClass();

        // Tawag sa inner method (love)
        inner.display();
    }
}