import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.empty();
        // System.out.println("at 6"+opt1.orElse("else"));               // empty
Optional<String> opt2 = Optional.of("Hello");           // must not be null
Optional<String> opt3 = Optional.ofNullable(null);     
// Optional<Integer> opt11=Optional.of(null);
 // null safe
// opt3.ifPresent(val -> System.out.println(val)); // won't execute, no exception
List<String> names = List.of("John", "Jane", "Mike");
Optional<String> first = names.stream()
                              .filter(n -> n.startsWith("J"))
                              .findFirst();
    System.out.println("at 6"+first.get());               // empty

Optional<String> opt = Optional.of("null");
opt.ifPresentOrElse(
    val -> System.out.println(val),
    () -> System.out.println("No value")
);Consumer<String> printerr = str -> System.out.println("Hello, " + str);

printerr.accept("John");   // Output: Hello, John
printerr.accept("Jane");   // Output: Hello, Jane


List<String> names1 = List.of("E", "Jane", "Mike");

// Predicate to check condition
Predicate<String> startsWithJ = name -> name.startsWith("J");

// Consumer to perform action
Consumer<String> printer = name -> System.out.println("Name: " + name);

names1.stream()
     .filter(startsWithJ)   // apply Predicate
     .forEach(printer);  
     


    }
}
