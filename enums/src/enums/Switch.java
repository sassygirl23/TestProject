  package enums;

enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}

public class Switch {

    public static void main(String[] args) {

        TrafficLight light =
                TrafficLight.GREEN;
        //printout means GO, usad na dina traffic
        // Switch using enum
        switch (light) {

            case RED:
                System.out.println("STOP");
                break;

            case YELLOW:
                System.out.println("SLOW");
                break;

            case GREEN:
                System.out.println("GO");
                break;
           
        }

        // Sa switch-case hindi nilalagay ang enum type

    }
}