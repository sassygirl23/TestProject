package Lambda;

import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {

        // Consumer accepts value
        Consumer<String> printer =
                name -> System.out.println(name);

        printer.accept("Rica Gandara");
    }
}