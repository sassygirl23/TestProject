package enums; 

public class MethodO {

    static void process(String value) {
        System.out.println("String overload");
    }

    static void process(String... values) {

        if (values.length < 2) {
            throw new RuntimeException("Need at least two values");
        }

        System.out.println("Varargs overload");

        for (String value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {

        process("A");
        process("A", "B"); 
    }
}