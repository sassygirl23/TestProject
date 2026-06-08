package buffer;

import java.io.BufferedReader;
import java.io.StringReader;

public class Reader {

    public static void main(String[] args)
            throws Exception {

        // StringReader ginagamit
        // para walang actual file needed
        BufferedReader reader =
                new BufferedReader(
                        new StringReader("Aja"));

        System.out.println(
                reader.readLine());

        reader.close();

         //BufferedReader is ginagamit sa reading text
    }
}