package enums;

enum IcedCoffeeSize {
	
//Craving for coffee hooooo

    // Tawag sa enum constructor
    SMALL(150),
    MEDIUM(250),
    LARGE(350);

    // Field ng enum
    private int ml;

    // Private constructor automatically
    IcedCoffeeSize(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }
}

public class Constructor {

    public static void main(String[] args) {

        IcedCoffeeSize coffee = IcedCoffeeSize.MEDIUM;

        System.out.println(coffee);
        System.out.println(coffee.getMl() + "ml");

        //Noted by loml<3 :Enum constructors are always private
    }
}