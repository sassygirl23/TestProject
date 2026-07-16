package records;

// Basic record declaration Chapter 9
record Student(String name, int age) {
}

public class Basic {

    public static void main(String[] args) {

        // Gumagawa ng record object
        Student s1 = new Student("Rica", 23);

        // Automatic getter ng methods
        // name() and age()
        System.out.println(s1.name());
        System.out.println(s1.age());

        // Automatic toString()
        System.out.println(s1);


    }
}