package interfaces;

interface MathUtility {

    // Static method inside interface
    static int add(int a, int b) {

        return a + b;
    }
}

public class Static {

    public static void main(String[] args) {

        // Tawag gamit interface name
        int result =
                MathUtility.add(5, 3);

        System.out.println(result);

        
         //Interface static methods is hindi siya inherited
    }
}


