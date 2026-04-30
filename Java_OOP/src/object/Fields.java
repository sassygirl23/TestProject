package object;

public class Fields {

    String title = "MULTO";
    int pages = 500;

    public static void main(String[] args) {
        Fields ebook = new Fields();

        System.out.println("Before: " + ebook.title + ", " + ebook.pages);

        ebook.title = "TOTGA";
        ebook.pages = 800;

        System.out.println("After: " + ebook.title + ", " + ebook.pages);
    }
}