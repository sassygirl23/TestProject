package records;

public class Excemption {

    public static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You must be 18 or above.");
        }

        System.out.println("Access granted!");
    }

    public static void main(String[] args) {

        try {
            checkAge(18);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}