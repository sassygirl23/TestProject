package methods;

public class Constructor {

    String name;

    Constructor(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor("Babiii");
        System.out.println(obj.name);
    }
}