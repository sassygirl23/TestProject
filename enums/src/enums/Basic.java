package enums;

// Basic enum declaration
enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY
}

public class Basic {

    public static void main(String[] args) {

        // Gumagamit ng enum constant
        Day today = Day.THURSDAY;

        System.out.println(today);

        // Enum constants are static and final
    }
}