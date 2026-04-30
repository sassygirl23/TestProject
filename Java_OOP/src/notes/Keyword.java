package notes;

public class Keyword{

    String name;

    void setName(String name) {
        this.name = name;
    }

    void printName() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        Keyword obj = new Keyword();
        obj.setName("Rica Guarino Buenafe");
        obj.printName();
    }
}