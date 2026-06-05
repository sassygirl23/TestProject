package exceptions;

//Custom exception class
class InvalidScoreException
     extends Exception {

 InvalidScoreException(String message) {

     super(message);
 }
}

public class Custom {

 public static void validateScore(int score)
         throws InvalidScoreException {

     if (score < 0) {

         throw new InvalidScoreException(
                 "Score cannot be negative");
     }

     System.out.println("Valid score");
 }

 public static void main(String[] args) {

     try {

         validateScore(90);

     } catch (InvalidScoreException e) {

         System.out.println(e.getMessage());
     }
 }



}
