package inheritance;

class Shape {

    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing square");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        // Parent reference, child object
        Shape s1 = new Circle();
        Shape s2 = new Square();

        // Runtime ang magdedecide kung anong draw() ang tatawagin
        s1.draw();
        s2.draw();
	

	
	}

}
