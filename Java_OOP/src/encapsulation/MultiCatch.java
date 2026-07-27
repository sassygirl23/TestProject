package encapsulation;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class MultiCatch {

    static void processStudent(int choice) {

        try {

            if (choice == 1) {
                throw new FileNotFoundException("Student record file not found.");
            } else if (choice == 2) {
                throw new EOFException("No more student records.");
            } else {
                System.out.println("Student records processed successfully.");
            }

        } catch (FileNotFoundException | EOFException e) {

            System.out.println("An error occurred while processing student records.");
            System.out.println("Reason: " + e.getMessage());

        }

        System.out.println("End of process().");
    }

    public static void main(String[] args) {

        System.out.println("=== Case 1 ===");
        processStudent(1);

        System.out.println("\n=== Case 2 ===");
        processStudent(2);

        System.out.println("\n=== Case 3 ===");
        processStudent(3);
    }
}