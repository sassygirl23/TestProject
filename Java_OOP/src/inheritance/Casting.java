package inheritance;

class Person {

    void speak() {
        System.out.println("Person speaking (Uwang Pangit)");
    }
}

class Student extends Person {

    void study() {
        System.out.println("Student studying (Pretty Chochaii)");
    }
}

public class Casting{

    public static void main(String[] args) {

        // Upcasting: child object stored in parent reference
        Person person = new Student();

        person.speak();

        // Downcasting: balik sa Student type
        Student student = (Student) person;

        student.study();

	}

}
