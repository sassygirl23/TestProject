package encapsulation;

public class Setter {

    // private field
    private String title;

    // Getter = pangkuha ng value, from the word get okay
    public String getTitle() {
        return title;
    }

    // Setter = pang-set ng value, kelangan may set ang value
    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {

        // Gumagawa ng object
        Setter book =
                new Setter();

        // Setter ginagamit para maglagay ng value
        book.setTitle("OCP Java 21 -na nagpapadugo ng ilong ko :(");

        // Getter ginagamit para mabasa value
        System.out.println(book.getTitle());
    }
}
// perfect ot understand the difference of setter and getter