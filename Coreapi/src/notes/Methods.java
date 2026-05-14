package notes;

public class Methods {

    public static void main(String[] args) {

        String text = "Keri Ko To till the end 21";

        // length
        System.out.println(text.length());

        // charAt
        System.out.println(text.charAt(0));

        // substring
        System.out.println(text.substring(4));

        // contains/ parang search for the word on the given text pag wala its a false.
        System.out.println(text.contains("End"));

        // replace/ ayaw gumana pag hindi numbers yung nilagay
        System.out.println(
                text.replace("21", "17"));

        // make everything capslock
        System.out.println(
                text.toUpperCase());

        
    }
}