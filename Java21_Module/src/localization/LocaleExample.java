package localization;
//may error/warning pag new = locale ung ginagamit 
import java.util.Locale;

public class LocaleExample {

    public static void main(String[] args) {

        // English - United States
        Locale us =
                Locale.of("en", "US");

        // Filipino - Philippines
        Locale ph =
                Locale.of("fil", "PH");

        System.out.println(us);
        System.out.println(ph);


//Locale do represents language and region
    }
}