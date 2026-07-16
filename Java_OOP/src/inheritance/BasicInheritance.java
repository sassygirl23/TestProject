package inheritance;

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}
	public class BasicInheritance {
		public static void main(String[] args) {

			// Gumagawa tayo ng Dog object
			Dog dog = new Dog();

			// eat() galing sa parent class na Animal
        dog.eat();
        
        	// bark() sariling method ng Dog
        	dog.bark();
    }
	
}


