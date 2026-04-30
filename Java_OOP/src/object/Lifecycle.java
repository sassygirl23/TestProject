package object;
// medyo nakakalito here, pero keri naman. which is kaya naging B yung value nung obj1, kasi tinawag nating yung obj2 as a new value niya
public class Lifecycle {

    String value;

    public Lifecycle(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Lifecycle obj1 = new Lifecycle("A");
        Lifecycle obj2 = new Lifecycle("B");

        obj1 = obj2;
        obj2 = null;

        System.out.println("Program done. One object may be eligible for garbage collection.");
        System.out.println("obj1 points to: " + obj1.value);
    }
}