import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

interface Greeting {
    void sayHello(String name);
}

public class FunctionalDemo {
    public static void main(String[] args) {
        // Greeting g=name-> System.out.println(name);
        // g.sayHello("vishal");

        Predicate<String> t=(String p)->(p!=null && p.length()>10 );
        Predicate<String> t11=(String t1)-> (t1.length()<2);
        System.out.println(t.and(t11).test("100"));

       Consumer<List<Integer>> c = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) * 2); // set new value at index
            }
        };

        List<Integer> li=new ArrayList<>(Arrays.asList(1,2,3));

        c.accept(li);
                System.out.println(li); // [2, 4, 6, 8, 10]

        
    }    
}
