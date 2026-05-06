package encapsulation;

// final class = hindi na pwede ma-inherit
public final class Immutable {

    // final fields = isang beses lang pwede ma-assign
    private final String name;
    private final int age;

    // Constructor lang pwede mag-set values
    public Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter para mabasa ang name
    public String getName() {
        return name;
    }

    // Getter para mabasa ang age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        // Gumagawa ng immutable object
        Immutable obj =
                new Immutable("Mccoy", 24);

        // Pwede mabasa values
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        // Walang setter methods kaya hindi mababago values


    }
}