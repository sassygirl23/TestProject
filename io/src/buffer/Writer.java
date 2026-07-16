package buffer;

import java.io.BufferedWriter;
import java.io.StringWriter;

public class Writer {

    public static void main(String[] args)
            throws Exception {

        StringWriter sw =
                new StringWriter();

        BufferedWriter writer =
                new BufferedWriter(sw);

        writer.write("Fighting");

        writer.close();

        System.out.println(sw);

        // BufferedWriter is ginagamit sa writing text

    }
}