package exceptions;

import java.io.BufferedReader;
import java.io.StringReader;

public class Resources {

    public static void main(String[] args) {

        // Automatic resource closing to
        try (BufferedReader br =
                     new BufferedReader(
                             new StringReader("Hello po, its me Icayy"))) {

            System.out.println(br.readLine());

        } catch (Exception e) {

            System.out.println("Error occurred");
        }
    }
}