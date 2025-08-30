import java.lang.*;

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow clone of Address
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy (copies reference of Address)
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy (creates new Address too)
    protected Person deepClone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.address = (Address) address.clone(); // new Address object
        return cloned;
    }
}

public class ClonedEx {
    public static void main(String[] args) throws Exception {
        Address addr = new Address("Delhi");
        Person p1 = new Person("Vishal", addr);

        // Shallow copy
        Person p2 = (Person) p1.clone();
        p2.address.city = "Mumbai";

        System.out.println("After Shallow Copy:");
        System.out.println("p1.address.city = " + p1.address.city); // Mumbai (affected!)
        System.out.println("p2.address.city = " + p2.address.city); // Mumbai

        // Deep copy
        Person p3 = p1.deepClone();
        p3.address.city = "Bangalore";

        System.out.println("\nAfter Deep Copy:");
        System.out.println("p1.address.city = " + p1.address.city); // Mumbai (unchanged)
        System.out.println("p3.address.city = " + p3.address.city); // Bangalore
    }
}
