package Exercise;

public class Fifteen01 {

    // Custom checked exception
    static class InvalidCharacterException extends Exception {
        public InvalidCharacterException(String message) {
            super(message);
        }
    }

    // Method to count vowels
    public static int countVowels(char[] letters) throws InvalidCharacterException {

        int count = 0;

        for (int i = 0; i < letters.length; i++) {

            char ch = Character.toLowerCase(letters[i]);

            // mag t throw  exception 
            if (ch == 'x') {
                throw new InvalidCharacterException("Letter 'x' is not allowed.");
            }

            // Count vowels
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // Check if walang command-line arguments
        if (args.length == 0) {
            System.out.println("No command-line arguments.");
        } else {

          
            for (int i = 0; i < args.length; i++) {

                try {

                    int vowels = countVowels(args[i].toCharArray());

                    System.out.println(args[i] + " -> Number of vowels: " + vowels);

                } catch (InvalidCharacterException e) {

                    System.out.println(args[i] + " -> " + e.getMessage()); 
                    
                }
            }
        }

        System.out.println("Program finished.");
    }
}
