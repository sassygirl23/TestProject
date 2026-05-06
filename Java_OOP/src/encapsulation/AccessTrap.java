package encapsulation;

class Animal {

    // private field
    private String name = "Carabao";

    // private method
    private void print() {
        System.out.println(name);
    }

    void test() {

        // Pwede dito kasi same class baga
        print();
    }
}

public class AccessTrap {

    public static void main(String[] args) {

        Animal a = new Animal();

        // Accessible
        a.test();

        // ekis - Compile Error
        // private method kasi
        // a.print();

        // ⚠️ Exam Tip:
        // private members
        // same class lang accessible
    }
}