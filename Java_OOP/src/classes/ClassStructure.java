package classes;

public class ClassStructure {

    int instanceValue = 10;
    static int staticValue = 20;

    public static void main(String[] args) {
        ClassStructure obj = new ClassStructure();
        obj.showValues();
    }

    void showValues() {
        int localValue = 30;

        System.out.println("Instance: " + instanceValue);
        System.out.println("Static: " + staticValue);
        System.out.println("Local: " + localValue);
    }
}