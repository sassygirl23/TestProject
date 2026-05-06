package encapsulation;

public class Protected {

    // protected field
    protected String value =
            "Protected Field";

    // protected method
    protected void showMessage() {
        System.out.println("Protected Method");
    }

    public static void main(String[] args) {

        // Gumagawa object
        Protected obj =
                new Protected();

        // Accessible kasi same class sila
        System.out.println(obj.value);

        // Accessible din ang method
        obj.showMessage();
    }
}