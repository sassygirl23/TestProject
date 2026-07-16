package inheritance;

class Parent {

    Parent() {
        // Parent constructor unang tatawagin
        System.out.println("Parent siya");
    }
}

class Child extends Parent {
	

    Child() {
        // Bago ito mag-run, automatic munang tatawagin ang super()
        System.out.println("Child ako");
    }
}

public class Constructor {

	public static void main(String[] args) {
		
		 // Kapag gumawa ng Child object, tatawagin muna ang Parent constructor

	}

}
