package records;

public class Runtime2 {

    public static void checkNumber(int number) {
        if (number > 0) {
            throw new RuntimeException("Number cannot be positive.");
        }
    }
  
    public static void main(String[] args) {

        try {
            checkNumber(25);
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
               
    }
}