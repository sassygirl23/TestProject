package buffer;

import java.io.Serializable;


class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    String name = "Rica";
}

public class Serialization {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.name);

        
 //Serializable marker interface (ginagamit para  ma-save object state)

    }
}