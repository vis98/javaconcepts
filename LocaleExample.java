// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         List<String> names = Arrays.asList("raju", "mohan", "amit","Ba");

//         // Lambda
//         // names.sort((a, b) -> a.compareToIgnoreCase(b));

//         // Method reference (cleaner)
//         //  names.sort(String::compareToIgnoreCase);
        
//         // names.sort(Comparator.comparing(String::toLowerCase).reversed());

//         // System.out.println(names);
        
//         String word = "Istanbul";

// // Default lowercase (depends on system locale)
// System.out.println(word.toLowerCase());

// // Locale-specific lowercase
// System.out.println(word.toLowerCase(Locale.ENGLISH));
// System.out.println(word.toLowerCase(new Locale("tr", "TR"))); // Turkish

//     }
// }


import java.util.*;

public class LocaleExample {
    public static void main(String[] args) {
        String text = "I";

        // Default lowercase (depends on your system locale)
        System.out.println("Default locale: " + text.toLowerCase());

        // Explicit English locale
        System.out.println("English locale: " + text.toLowerCase(Locale.ENGLISH));

        // Turkish locale
        System.out.println("Turkish locale: " + text.toLowerCase(new Locale("tr", "TR")));
    }
}
