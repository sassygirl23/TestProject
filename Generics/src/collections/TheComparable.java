package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // natural ordering (dito age ang basis ng sorting)
    @Override
    public int compareTo(Student other) {
        return this.age - other.age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class TheComparable {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Rica", 23));
        students.add(new Student("Wang_U", 27));
        students.add(new Student("Berto", 25));

        Collections.sort(students);

        System.out.println(students);
    }
}