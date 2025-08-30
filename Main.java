// // import java.util.*;

// // public class Main {
// //     public static void main(String[] args) {
// //         List<String> names = Arrays.asList("raju", "mohan", "amit","Ba");

// //         // Lambda
// //         // names.sort((a, b) -> a.compareToIgnoreCase(b));

// //         // Method reference (cleaner)
// //         //  names.sort(String::compareToIgnoreCase);
        
// //         // names.sort(Comparator.comparing(String::toLowerCase).reversed());

// //         // System.out.println(names);
        
// //         String word = "Istanbul";

// // // Default lowercase (depends on system locale)
// // System.out.println(word.toLowerCase());

// // // Locale-specific lowercase
// // System.out.println(word.toLowerCase(Locale.ENGLISH));
// // System.out.println(word.toLowerCase(new Locale("tr", "TR"))); // Turkish

// //     }
// // }


// // import java.util.*;

// // public class LocaleExample {
// //     public static void main(String[] args) {
// //         String text = "I";

// //         // Default lowercase (depends on your system locale)
// //         System.out.println("Default locale: " + text.toLowerCase());

// //         // Explicit English locale
// //         System.out.println("English locale: " + text.toLowerCase(Locale.ENGLISH));

// //         // Turkish locale
// //         System.out.println("Turkish locale: " + text.toLowerCase(new Locale("tr", "TR")));
// //     }
// // }


// import java.util.*;

// class Person {
//     String name;
//     Person(String name) { this.name = name; }
//     public String toString() { return name; }
//     public String getName(){return this.name;}
// }

// public class Main {
//     public static void main(String[] args) {
//         List<String> names = Arrays.asList("Ravi", "Amit", "Neha");

//         // Lambda: map string -> Person
//         // List<Person> people1 = names.stream().map(n -> new Person(n)).toList();

//         // Constructor reference: ClassName::new
//         List<Person> people2 = names.stream().map(Person::new).toList();

//         // people2.forEach(System.out::println);
//         // people2.sort(Comparator.comparing(Person::getName));
//                 people2.sort(Comparator.comparing(Person::getName));
//                         people2.forEach(System.out::println);


//     }
// }


// import java.util.*;

// // public class Main {
// //     public static void main(String[] args) {
// //         List<String> names = Arrays.asList("raju", "mohan", "amit","Ba");

// //         // Lambda
// //         // names.sort((a, b) -> a.compareToIgnoreCase(b));

// //         // Method reference (cleaner)
// //         //  names.sort(String::compareToIgnoreCase);
        
// //         // names.sort(Comparator.comparing(String::toLowerCase).reversed());

// //         // System.out.println(names);
        
// //         String word = "Istanbul";

// // // Default lowercase (depends on system locale)
// // System.out.println(word.toLowerCase());

// // // Locale-specific lowercase
// // System.out.println(word.toLowerCase(Locale.ENGLISH));
// // System.out.println(word.toLowerCase(new Locale("tr", "TR"))); // Turkish

// //     }
// // }


// // import java.util.*;

// // public class LocaleExample {
// //     public static void main(String[] args) {
// //         String text = "I";

// //         // Default lowercase (depends on your system locale)
// //         System.out.println("Default locale: " + text.toLowerCase());

// //         // Explicit English locale
// //         System.out.println("English locale: " + text.toLowerCase(Locale.ENGLISH));

// //         // Turkish locale
// //         System.out.println("Turkish locale: " + text.toLowerCase(new Locale("tr", "TR")));
// //     }
// // }


// import java.util.*;

// class Person {
//     String name;
//     Person(String name) { this.name = name; }
//     public String toString() { return name; }
//     public String getName(){return this.name;}
// }

// public class Main {
//     public static void main(String[] args) {
//         List<String> names = Arrays.asList("Ravi", "Amit", "Neha");

//         // Lambda: map string -> Person
//         // List<Person> people1 = names.stream().map(n -> new Person(n)).toList();

//         // Constructor reference: ClassName::new
//         List<Person> people2 = names.stream().map(Person::new).toList();

//         // people2.forEach(System.out::println);
//         // people2.sort(Comparator.comparing(Person::getName));
//                 people2.sort(Comparator.comparing(Person::getName));
//                         people2.forEach(System.out::println);


//     }
// }
import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return this.name;
    }
}

public class Main {
    // public static void main(String[] args) {
    //     List<String> names = Arrays.asList("Ravi", "Amit", "Neha");

    //     // Create modifiable list using Collectors.toList()
    //     List<Person> people = names.stream()
    //                                .map(Person::new)
    //                                .collect(Collectors.toList());

    //     // Sort by name
    //     people.sort(Comparator.comparing(Person::getName));

    //     // Print sorted list
    //     people.forEach(System.out::println);
public static void main(String[] args) {
    List<String> names = Arrays.asList("Ravi", "Rahul", "Amit", "Anita", "Neha");

Map<Character, List<String>> grouped =
    names.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
    
System.out.println(grouped);
}
// {A=[Amit, Anita], R=[Ravi, Rahul], N=[Neha]}

}
