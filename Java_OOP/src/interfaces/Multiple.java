package interfaces;

interface Flyable { //based on my research there's a word 'flyabe'

    void fly();
}

interface Swimmable {

    void swim();
}

// Multiple interfaces allowed
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {

        System.out.println("Duck flying");
    }

    @Override
    public void swim() {

        System.out.println("Duck swimming");
    }
}

public class Multiple {

    public static void main(String[] args) {

        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}