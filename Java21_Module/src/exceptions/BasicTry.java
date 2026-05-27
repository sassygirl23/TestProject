package exceptions;
// diko to masyado ma gets, but i did my very best. i'll comeback
public class BasicTry {

    public static void main(String[] args) {

        try {

            // Code na possible mag-error
            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) { //ito ang sumalo ng exception

            // Catch block na hahawak ng exception, because bawal mag divide ng zero.
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues..........");//kaya tuloy ang execution
    }
}