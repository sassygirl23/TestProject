package localization;

import java.util.Locale;

public class LocaleBuilder {

    public static void main(String[] args) {

        Locale locale =
                new Locale.Builder()

                        .setLanguage("en")

                        .setRegion("US")

                        .build();

        System.out.println(locale);

//Locale.Builder do modern way to create Locale

    }
}