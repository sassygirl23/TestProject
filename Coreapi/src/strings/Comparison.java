package strings;

public class Comparison {

    public static void main(String[] args) {

        String s1 = "Sassy";
        String s2 = "Sassy";

        String s3 = new String("Sassy");

        // == compares references
        System.out.println(s1 == s2);

        // false because new object
        System.out.println(s1 == s3);

        // equals compares contents
        System.out.println(s1.equals(s3));

        /*
         * == = reference comparison
         * equals() = content comparison
         */
    }
}