package object;

public class Creation {

    String name;

    public static void main(String[] args) {
        Creation obj1 = new Creation();
        Creation obj2 = new Creation();

        obj1.name = "Chochaii";
        obj2.name = "Icayy";

        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}