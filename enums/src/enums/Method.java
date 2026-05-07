package enums;

enum PaymentStatus {

    PAID,
    PENDING,
    FAILED;

    // Enum method
    public boolean isSuccessful() {

        // this refers to current enum constant
        return this == PAID;
    }
}

public class Method {

    public static void main(String[] args) {

        PaymentStatus status =
                PaymentStatus.PAID;

        System.out.println(status);

        // Tawag sa enum method
        System.out.println(
                "Successful? " +
                        status.isSuccessful());
    }
}