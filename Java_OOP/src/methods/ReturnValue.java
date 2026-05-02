package methods;

public class ReturnValue {

    public static void main(String[] args) {
        int x = 22;
        changeValue(x);
        System.out.println("After method: " + x);

        StringBuilder sb = new StringBuilder("Kalapastangan");
        changeBuilder(sb);
        System.out.println("After builder: " + sb);
    }

    static void changeValue(int num) {
        num = 50;
    }

    static void changeBuilder(StringBuilder sb) {
        sb.append(" 23");
    }
}