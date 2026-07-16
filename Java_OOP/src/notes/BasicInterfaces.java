package notes;

//Interface
interface Animal {

 // Automatically: public abstract
 void sound();
}

//Class implementing interface
class Dog implements Animal {

 @Override
 public void sound() {

     // Required i-implement ang interface method
     System.out.println("Dog barks (arf arf)");
 }
}

public class BasicInterfaces {

 public static void main(String[] args) {

     // Interface reference
     Animal animal = new Dog();

     animal.sound();
 }
}



