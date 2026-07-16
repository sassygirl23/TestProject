package encapsulation;

public class AccessModify {

    // public = accessible kahit saan banda ng pilipinas
    public int publicValue = 1;

    // protected = accessible sa same package lang
    // at subclasses
    protected int protectedValue = 2;

    // package-private (walang modifier)
    // accessible lang sa same package
    int packageValue = 3;

    // private = accessible lang sa loob ng same class
    private int privateValue = 4;

    public void showValues() {

        // Lahat accessible dito
        // kasi nasa loob tayo ng same class / yes korek
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(packageValue);
        System.out.println(privateValue);
    }

    public static void main(String[] args) {

        // Gumagawa ng object
        AccessModify obj =
                new AccessModify();

        // Tatawagin dito ang method
        obj.showValues();
    }
}