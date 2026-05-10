package records;

// Record with compact constructor
record Product(String name, double price) {

    // Compact constructor
    Product {

        // Hindi kailangan ulitin fields automatic assignment na

        if (price < 0) {
            throw new IllegalArgumentException(
                    "Invalid price");
        }
    }
}

public class Compact {

    public static void main(String[] args) {

        Product p =
                new Product("Laptop", 55000);

        System.out.println(p);
    }
}