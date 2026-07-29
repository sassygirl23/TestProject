package Exercise;

//

public class Fifteen02{

    // Method that returns the sum of the array elements
    public static int sum(int[] values, int start, int end) throws Exception {

        // Throw NullPointerException if array is null
        if (values == null) {
            throw new NullPointerException("Array is null.");
        }

        // Throw IllegalArgumentException if array length is 0
        if (values.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        // Throw ArrayIndexOutOfBoundsException if indices are invalid
        if (start < 0 || end >= values.length || start > end) {
            throw new ArrayIndexOutOfBoundsException("Invalid start or end index.");
        }
    }
}