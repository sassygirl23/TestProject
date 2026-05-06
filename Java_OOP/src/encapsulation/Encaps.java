package encapsulation;

public class Encaps {

    // private fields
    // hindi siya directly accessible outside the class
    private String name;
    private int age;

    // Setter method para sa names
    public void setName(String name) {
        this.name = name;
    }

    // Setter method with validations
    public void setAge(int age) {

        // Validation:
        // bawal negative age, kasi wala naman talaga age na negative diba.
        if (age >= 0) {
            this.age = age;
        }
    }

    // Method para ipakita ang values, pero value mo sa kanya wala
    public void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {

        // Gumagawa ng object
        Encaps person =
                new Encaps();

        // Hindi pwede:kami alng ang pede
        // person.age = -5;

        // Kaya setter ang ginagamit
        person.setName("Rica");
        person.setAge(23);

        // Display ng result
        person.display();
    }
}