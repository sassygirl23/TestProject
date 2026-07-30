package Exercise;

public class Fifteen02{
	
	

    
    public static int sum(int[] values, int start, int end) throws Exception {

        // nag t'throw NullPointerException if array is null
        if (values == null) {
            throw new NullPointerException("Array is null.");
        }

        // nag t'throw IllegalArgumentException if array length is 0
        if (values.length == 0) {
            throw new IllegalArgumentException("Array is empty.");
        }

        // nag t'throw ArrayIndexOutOfBoundsException if indices are invalid
        if (start < 0 || end >= values.length || start > end) {
            throw new ArrayIndexOutOfBoundsException("Invalid start or end index.");
        }
        int total = 0;

        // mag compute ng sum from start to end                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        for (int i = start; i <= end; i++) {
            total += values[i];
        }

        // mag t'throw Exception if sum is 0
        if (total == 0) {
            throw new Exception("Sum is 0.");
        }

        return total;
    }
 public static void main(String[] args) {

        
        int[] numbers = {-5, -2, -3, 10, 0};

        try {
            int answer = sum(numbers, 0, 3);
            System.out.println("Sum = " + answer);
        }
        catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    
    


//to be continued...








/*
*Create a method int sum(int[] values, int start, int end) that
*throws an IllegalArgumentException when passed an array of length 0, a NullPointerException when passed a null, 
*and ArrayIndexOutOfBoundsException when start and end do not fall within the range of the given array. 
*It should return the sum of the values in the array from start to end but must throw Exception when sum is 0.
*/
