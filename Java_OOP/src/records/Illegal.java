package records;

public class Illegal {

    static void rate(String movie, int score) {
        if (score < 1 || score > 10)
            throw new IllegalArgumentException("Invalid rating: " + score);

        System.out.println(movie + " = " + score + "/10");
    }

    static void rate(String movie, int... scores) {
        if (scores.length == 0)
            throw new IllegalArgumentException("No ratings provided");

        for (int score : scores)
            rate(movie, score);
    }

    public static void main(String[] args) {
        rate("Interstellar", 10, 11);
        rate("Dune", 8, 9);
    }
}