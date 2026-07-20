package enums;

public class Arithmetic2 {

    // Function na nagdi-divide ng unang number sa pangalawang number
	
    static int divide(int... numbers) {

      
        if (numbers.length != 2) {
            System.out.println("Maglagay lamang ng 2 numbers.");
            return 0;
        }

     
        int num1 = numbers[0];
        int num2 = numbers[1];

        try {
            // Magkakaroon ng ArithmeticException kapag 0 ang divisor
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: Can't divide 0.");
            return 0;
        }
    }

    public static void main(String[] args) {

        
        int answer1 = divide(20, 4);
        System.out.println("Ans: " + answer1);

    
        int answer2 = divide(20, 0);
        System.out.println("Ans: " + answer2);
    }
}