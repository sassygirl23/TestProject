package strings;

public class Builder {

    public static void main(String[] args) {

        StringBuilder sb =
                new StringBuilder("Java");

        // append()
        sb.append("21");

        System.out.println(sb);

        /*
         * StringBuilder is mutable
         * same object lang ang binabago
         * here shows the difference between iimutability and builder
         */
    }
}