package strings;

public class Immutability {

    public static void main(String[] args) {

        String name = "Alonzo Jaime";

        // Hindi nababago ang original yung String (so back off)
        name.concat("3"); //kahit baguhin dito yung # still mag pprint siya pero yung masusunod yung nasa baba

        System.out.println(name);

        name = name.concat("3");

        System.out.println(name);

        /*
         * String is immutable
         * every modification creates new object
         */
    }
}