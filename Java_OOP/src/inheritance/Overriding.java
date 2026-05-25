package inheritance;
// ang gulo gulo here, kaya nagpatulong ako kay chatgpt hihiz
class Bird {

    void sound() {
        System.out.println("Bird makes sound (twit twit)");
    }
}

class Parrot extends Bird {

    @Override
    void sound() {
        // Overriding = same method name/signature, pero ibang behavior sa child class
        System.out.println("Parrot talks");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Parrot parrot = new Parrot();

        // Ang tatawagin ay overridden method ng Parrot
        parrot.sound();
    }
}
