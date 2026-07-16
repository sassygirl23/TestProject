package Lambda;

import java.util.function.Predicate;

public class LNotes {

    public static void main(String[] args) {

        Predicate<String> empty =
                s -> s.isEmpty();

        System.out.println(
                empty.test(""));

        // ⚠️ OCP Trap:
        // test() ginagamit sa Predicate
    }
}

    /*LAMBDA RULES
      Functional Interface
      = exactly one abstract method
     
     * COMMON INTERFACES
     
     * Predicate<T>
      test()
      returns boolean
     
     * Consumer<T>
      accept()
      returns void
     
     * Supplier<T>
   		get()
      	produces value
     
     * Function<T,R>
      apply()
      transforms value
     
      =========================
     * METHOD REFERENCES
      =========================
      System.out::println
      shortcut ng lambda
     */
