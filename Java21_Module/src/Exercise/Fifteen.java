package Exercise;
public class Fifteen {

    // Custom checked exception
    static class InvalidCharacterException extends Exception {
        public InvalidCharacterException(String message) {
            super(message);
        }
    }

    // Method to count vowels
    public static int countVowels(char[] letters) throws InvalidCharacterException {
        int count = 0;

        for (char ch : letters) {

            if (ch == 'x' || ch == 'X') {
                throw new InvalidCharacterException("The letter 'x' is not allowed.");
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        char[] letters = {'R', 'i', 'c', 'a', 'G', 'B', 'u', 'e', 'n', 'a', 'f', 'e'};

        try {
            int vowels = countVowels(letters);
            System.out.println("Number of vowels: " + vowels);
        } catch (InvalidCharacterException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Program finished.");
        }
    }
}
