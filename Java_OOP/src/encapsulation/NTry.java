package encapsulation;
import java.io.EOFException;
import java.util.ArrayList;

public class NTry {

    static ArrayList<String> students = new ArrayList<>();

    // process() method
    static void process() throws EOFException {

        try {
            if (students.isEmpty()) {
                throw new IndexOutOfBoundsException("No students found.");
            } else {
                throw new EOFException("End of student list.");
            }

        } catch (IndexOutOfBoundsException ioe) {

            System.out.println("Student list is empty.");

            try {
                // May panibagong exception habang hina-handle ang error
                throw new EOFException("No student records available.");
            } catch (EOFException eofe) {
                System.out.println("Inner catch handled the EOFException.");
                System.out.println("Exception message: " + eofe.getMessage());
            }
        }
    }

        static void doIt() throws EOFException {

        try {
            process();
        } catch (EOFException eofe) {

            System.out.println("doIt(): Student list has ended.");
            System.out.println("Saving report...");

            // ibalik ang exception
            throw eofe;
        }
    }

       public static void main(String[] args) {
        
        try {
            doIt();
        } catch (EOFException eofe) {

            System.out.println("Main: Program finished.");
            eofe.printStackTrace();
        }
    }
}
