package objective;

import java.io.CharConversionException;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Catch {

    public void process(int x) throws IOException {
        if (x == 0) {
            throw new CharConversionException();
        } else if (x == 1) {
            throw new FileNotFoundException();
        } else {
            throw new EOFException();
        }
    }

    public static void main(String[] args) {
        Catch catchExample = new Catch();

        try { 
            catchExample.process(1);
        } catch (EOFException e) {
            System.out.println("End of file reached");
        } catch (CharConversionException e) {
            System.out.println("Some problem with the file system");
        } catch (FileNotFoundException e) {
            System.out.println("No such file found");
        } catch (IOException e) {
            System.out.println("Unknown I/O exception");
        }
        
        try {
            catchExample.process(0);
        } catch (EOFException e) {
            System.out.println("End of file reached");
        } catch (CharConversionException e) {
            System.out.println("Some problem with the file system");
        } catch (FileNotFoundException e) {
            System.out.println("No such file found");
        } catch (IOException e) {
            System.out.println("Unknown I/O exception");
        }
        
        try {
            catchExample.process(2);
        } catch (EOFException e) {
            System.out.println("End of file reached");
        } catch (CharConversionException e) {
            System.out.println("Some problem with the file system");
        } catch (FileNotFoundException e) {
            System.out.println("No such file found");
        } catch (IOException e) {
            System.out.println("Unknown I/O exception");
        }
    }
}
