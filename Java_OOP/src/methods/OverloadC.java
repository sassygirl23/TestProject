package methods;

public class OverloadC {

    String name;
    int age;

    OverloadC(String name) {
        this.name = name;
    }

   OverloadC(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
       OverloadC a = new OverloadC("Bebu");
       OverloadC b = new OverloadC("Bebong", 1);

        System.out.println(a.name);
        System.out.println(b.name + " " + b.age);
    }
}