package buffer;

import java.io.Console;

public class ExampleOFConsole {

    public static void main(String[] args) {

        Console console =
                System.console();

        System.out.println(console);

        
//Eclipse usually returns null
        
    }
}